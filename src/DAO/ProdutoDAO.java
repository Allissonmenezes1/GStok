package DAO;

import PO.Produto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import util.Conexao;

public class ProdutoDAO {
    
    public boolean inserirProduto(Produto produto, int cpfFuncionario){
        Conexao conn = new Conexao();
        String sql = "INSERT INTO PRODUTO (NOME, DESCRICAO, COD_BARRAS, PRECO, COD_CATEGORIA, COD_MARCA, QUANTIDADE, LIMITE_MIN, LIMITE_MAX, CPF_GERENTE)"
                + "(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try{
            PreparedStatement sttm = conn.getConexao().prepareStatement(sql);
            sttm.setString(1, produto.getNome());
            sttm.setString(2, produto.getDescricao());
            sttm.setInt(3, produto.getCodBarras());
            sttm.setDouble(4, produto.getPreco());
            if(this.buscarCodCategoria(produto.getCategoria()) == -1)
                throw new Exception("Categoria inexistente");
            sttm.setInt(5, this.buscarCodCategoria(produto.getCategoria()));
            if(this.buscarCodMarca(produto.getCodMarca()) == -1)
                throw new Exception("Marca inexistente");
            sttm.setInt(6, this.buscarCodMarca(produto.getCodMarca()));
            sttm.setInt(7, produto.getQuantidade());
            sttm.setInt(8, produto.getLimiteMinimo());
            sttm.setInt(9, produto.getLimiteMaximo());
            sttm.setInt(10, cpfFuncionario);
            sttm.execute();
            return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            conn.fecharConexao();
        }  
    }
    
    public boolean inserirMarca(String marca){
        Conexao conn = new Conexao();
        String sql = "INSERT INTO MARCA (DESC_MARCA) VALUES (?)";
        try{
            PreparedStatement sttm = conn.getConexao().prepareStatement(sql);
            sttm.setString(1, marca);
            sttm.execute();
            return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            conn.fecharConexao();
        }
    }

    public int buscarCodMarca(String marca){
        Conexao conn = new Conexao();
        String sql = "SELECT COD_MARCA FROM MARCA WHERE DESC_MARCA = ?";
        try{
            PreparedStatement sttm = conn.getConexao().prepareStatement(sql);
            sttm.setString(1, marca);
            boolean result = sttm.execute();
            if(!result)
                return -1;
            ResultSet rs = sttm.executeQuery();
            rs.next();
            return rs.getInt("COD_MARCA");
        }catch(Exception e){
            e.printStackTrace();
            return -1;
        }finally{
            conn.fecharConexao();
        }
    }
    
    public String buscarMarca(int codMarca){
        Conexao conn = new Conexao();
        String sql = "SELECT DESC_MARCA FROM MARCA WHERE COD_MARCA = ?";
        try{
            PreparedStatement sttm = conn.getConexao().prepareStatement(sql);
            sttm.setInt(1, codMarca);
            boolean result = sttm.execute();
            if(!result)
                return null;
            ResultSet rs = sttm.executeQuery();
            rs.next();
            return rs.getString("DESC_MARCA");
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }finally{
            conn.fecharConexao();
        }
    }
    
    public ArrayList<String> buscarMarca(){
        Conexao conn = new Conexao();
        ArrayList<String> marca = new ArrayList<String>();
        String sql = "SELECT DESC_MARCA FROM MARCA";
        try{
            PreparedStatement sttm = conn.getConexao().prepareStatement(sql);
            boolean result = sttm.execute();
            if(!result)
                return null;
            ResultSet rs = sttm.executeQuery();
            while(rs.next())
                marca.add(rs.getString("DESC_MARCA"));
            return marca;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }finally{
            conn.fecharConexao();
        }
    }
    
    public boolean inserirCategoria(String categoria){
        Conexao conn = new Conexao();
        String sql = "INSERT INTO CATEGORIA (DESC_CATEGORIA) VALUES (?)";
        try{
            PreparedStatement sttm = conn.getConexao().prepareStatement(sql);
            sttm.setString(1, categoria);
            sttm.execute();
            return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            conn.fecharConexao();
        }
    }
    
    public int buscarCodCategoria(String categoria){
        Conexao conn = new Conexao();
        String sql = "SELECT COD_CATEGORIA FROM CATEGORIA WHERE DESC_CATEGORIA = ?";
        try{
            PreparedStatement sttm = conn.getConexao().prepareStatement(sql);
            sttm.setString(1, categoria);
            boolean result = sttm.execute();
            if(!result)
                return -1;
            ResultSet rs = sttm.executeQuery();
            rs.next();
            return rs.getInt("COD_CATEGORIA");
        }catch(Exception e){
            e.printStackTrace();
            return -1;
        }finally{
            conn.fecharConexao();
        }
    }
    
    public String buscarCategoria(int codCategoria){
        Conexao conn = new Conexao();
        String sql = "SELECT DESC_CATEGORIA FROM CATEGORIA WHERE COD_CATEGORIA = ?";
        try{
            PreparedStatement sttm = conn.getConexao().prepareStatement(sql);
            sttm.setInt(1, codCategoria);
            boolean result = sttm.execute();
            if(!result)
                return null;
            ResultSet rs = sttm.executeQuery();
            rs.next();
            return rs.getString("DESC_CATEGORIA");
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }finally{
            conn.fecharConexao();
        }
    }
    
    public ArrayList<String> buscarCategoria(){
        Conexao conn = new Conexao();
        ArrayList<String> categoria = new ArrayList<String>();
        String sql = "SELECT DESC_CATEGORIA FROM CATEGORIA";
        try{
            PreparedStatement sttm = conn.getConexao().prepareStatement(sql);
            boolean result = sttm.execute();
            if(!result)
                return null;
            ResultSet rs = sttm.executeQuery();
            while(rs.next())
                categoria.add(rs.getString("DESC_CATEGORIA"));
            return categoria;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }finally{
            conn.fecharConexao();
        }
    }
}
