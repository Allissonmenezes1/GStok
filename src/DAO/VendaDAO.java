
package DAO;

import PO.Produto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.Conexao;

public class VendaDAO {
    
    public boolean inserirVenda(int codBarras, int cpfFunc, int cpfCliente, int quantidade, int idVenda){
        Conexao conn = new Conexao();
        ProdutoDAO pDAO = new ProdutoDAO();
        String query = "";
        try{
            conn.getConexao().setAutoCommit(false);
            
            query = "SELECT ID FROM PRODUTO WHERE COD_BARRAS = ?";
            PreparedStatement sttm = conn.getConexao().prepareStatement(query);
            sttm.setInt(1, codBarras);
            boolean result = sttm.execute();
            if(!result)
                return false;
            ResultSet rs = sttm.executeQuery();
            rs.next();
            int idProduto = rs.getInt("ID");
            
            query = "INSERT INTO VENDA (ID, ID_PRODUTO, CPF_FUNC, CPF_CLIENTE, QUANTIDADE)"
                    + " VALUES (?, ?, ?, ?, ?)";
            sttm = conn.getConexao().prepareStatement(query);
            sttm.setInt(1, idVenda);
            sttm.setInt(2, idProduto);
            sttm.setInt(3, cpfFunc);
            sttm.setInt(4, cpfCliente);
            sttm.setInt(5, quantidade);
            sttm.execute();
            
            Produto p =  pDAO.buscarProduto(codBarras);
            query = "UPDATE PRODUTO SET QUANTIDADE = ?";
            sttm = conn.getConexao().prepareStatement(query);
            sttm.setInt(1, (p.getQuantidade() - quantidade) );
            
            conn.getConexao().commit();
            return true;
        }catch(Exception e){
            e.printStackTrace();
            try {
                conn.getConexao().rollback();
            } catch (SQLException ex) {
                Logger.getLogger(VendaDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
            return false;
        }finally{
            conn.fecharConexao();
        }
    }
    
}
