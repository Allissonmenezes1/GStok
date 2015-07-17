
package DAO;

import PO.Produto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import util.Conexao;

public class VendaDAO {
    
    public boolean inserirVenda(String codBarras, String cpfFunc, String cpfCliente, int quantidade, String idVenda){
        Conexao conn = new Conexao();
        ProdutoDAO pDAO = new ProdutoDAO();
        String query = "";
        try{
            
            query = "SELECT ID FROM PRODUTO WHERE COD_BARRAS = ?";
            PreparedStatement sttm = conn.getConexao().prepareStatement(query);
            sttm.setString(1, codBarras);
            boolean result = sttm.execute();
            if(!result)
                return false;
            ResultSet rs = sttm.executeQuery();
            rs.next();
            int idProduto = rs.getInt("ID");
            
            query = "INSERT INTO VENDA (ID, ID_PRODUTO, CPF_FUNC, CPF_CLIENTE, QUANTIDADE)"
                    + " VALUES (?, ?, ?, ?, ?)";
            sttm = conn.getConexao().prepareStatement(query);
            sttm.setString(1, idVenda);
            sttm.setInt(2, idProduto);
            sttm.setString(3, cpfFunc);
            sttm.setString(4, cpfCliente);
            sttm.setInt(5, quantidade);
            sttm.execute();
            
            Produto p =  pDAO.buscarProduto(codBarras);
            query = "UPDATE PRODUTO SET QUANTIDADE = ? WHERE ID = ?";
            sttm = conn.getConexao().prepareStatement(query);
            sttm.setInt(1, (p.getQuantidade() - quantidade) );
            sttm.setInt(2, idProduto);
            sttm.execute();
            return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            conn.fecharConexao();
        }
    }
    
}
