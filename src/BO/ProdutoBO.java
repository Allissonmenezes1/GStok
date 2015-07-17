
package BO;

import DAO.ProdutoDAO;
import PO.Produto;
import java.util.ArrayList;

public class ProdutoBO {
    private ProdutoDAO p;
    
    public ProdutoBO(){
        p = new ProdutoDAO();
    }
    
    
    public boolean cadastrarProduto(Produto produto, String cpfFuncionario){
        
        if(p.buscarProduto(produto.getCodBarras()) != null)
            return false;
        
        return p.inserirProduto(produto, cpfFuncionario);
        
    }
    
    public boolean cadastrarMarca(String marca){
        
        ArrayList<String> m = p.buscarMarca();
        
        for(int i = 0; i < m.size(); i++){
            if(m.get(i).equalsIgnoreCase(marca))
                return false;
        }
        
        return p.inserirMarca(marca);
    }
    
    public boolean cadastrarCategoria(String categoria){
        
        ArrayList<String> c = p.buscarCategoria();
        
        for(int i = 0; i < c.size(); i++){
            if(c.get(i).equalsIgnoreCase(categoria))
                return false;
        }
        
        return p.inserirCategoria(categoria);
    }
    
}
