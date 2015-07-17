
package BO;

import DAO.VendaDAO;
import DAO.ProdutoDAO;
import PO.Produto;
import java.rmi.server.UID;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.Conexao;

public class VendaBO {
    private VendaDAO v;
    
    public VendaBO(){
        v = new VendaDAO();
    }
    
    public boolean realizarVenda(ArrayList<Produto> produto, String cpfFunc, String cpfCliente){
        Conexao conn = null;
        boolean verifica = true;
        ProdutoDAO pDAO = new ProdutoDAO();
        
        for(int i = 0; i < produto.size(); i++){
            if(produto.get(i).getQuantidade() > pDAO.buscarProduto(produto.get(i).getCodBarras()).getQuantidade())
                return false;
        }
        
        try {
            conn = new Conexao();
            conn.getConexao().setAutoCommit(false);
            conn.savepoint();
            
            String id = UUID.randomUUID().toString().replaceAll("-", "");
            
            for(int i = 0; i < produto.size(); i++){
                verifica = v.inserirVenda(produto.get(i).getCodBarras(), cpfFunc, cpfCliente,
                        produto.get(i).getQuantidade(), id, conn);
                if(!verifica)
                    throw new Exception("Erro ao inserir venda");
            }
            
            conn.commit();
            return true;
        } catch (SQLException ex) {
            conn.rollback();
            Logger.getLogger(VendaBO.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
            return false;
        }catch (Exception e){
            conn.rollback();
            e.printStackTrace();
            return false;
        }finally{
            conn.fecharConexao();
        }   
    }
    
}
