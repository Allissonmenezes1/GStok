package DAO;

import PO.Produto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import util.Conexao;

public class ProdutoDAO {
    
    public boolean inserirProduto(Produto produto, String cpfFuncionario){
        Conexao conn = null;
        String sql = "INSERT INTO PRODUTO (NOME, DESCRICAO, COD_BARRAS, PRECO, COD_CATEGORIA, COD_MARCA, QUANTIDADE, LIMITE_MIN, LIMITE_MAX, CPF_GERENTE)"
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try{
            conn = new Conexao();
            PreparedStatement sttm = conn.getConexao().prepareStatement(sql);
            sttm.setString(1, produto.getNome());
            sttm.setString(2, produto.getDescricao());
            sttm.setString(3, produto.getCodBarras());
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
            sttm.setString(10, cpfFuncionario);
            sttm.execute();
            return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            conn.fecharConexao();
        }  
    }
    
    public boolean alterarProduto(Produto produto){
        Conexao conn = null;
        String sql = "UPDATE PRODUTO SET PRECO = ?, QUANTIDADE = ?, LIMITE_MAX = ?, LIMITE_MIN = ? WHERE COD_BARRAS = ?";
         try{
            conn = new Conexao(); 
            PreparedStatement sttm = conn.getConexao().prepareStatement(sql);
            sttm.setDouble(1, produto.getPreco());
            sttm.setInt(2, produto.getQuantidade());
            sttm.setInt(3, produto.getLimiteMaximo());
            sttm.setInt(4, produto.getLimiteMinimo());
            sttm.setString(5, produto.getCodBarras());
            sttm.execute();
            return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            conn.fecharConexao();
        }
    
    }
    
    public Produto buscarProduto(String codBarras){
        Conexao conn = null;
        String sql = "SELECT P.NOME, P.DESCRICAO, P.COD_BARRAS, P.PRECO, C.DESC_CATEGORIA, M.DESC_MARCA, P.QUANTIDADE, P.LIMITE_MIN, P.LIMITE_MAX "
                + "FROM PRODUTO as P INNER JOIN MARCA as M ON P.COD_MARCA = M.COD_MARCA INNER JOIN CATEGORIA as C ON P.COD_CATEGORIA = C.COD_CATEGORIA "
                + "WHERE P.COD_BARRAS = ?";
        try{
            conn = new Conexao();
            PreparedStatement sttm = conn.getConexao().prepareStatement(sql);
            sttm.setString(1, codBarras);;
            boolean result = sttm.execute();
            if(!result)
                return null;
            ResultSet rs = sttm.getResultSet();
            if(rs.next()){
                Produto p = new Produto(rs.getString("DESC_MARCA"), rs.getString("DESC_CATEGORIA"), rs.getString("COD_BARRAS"), rs.getInt("QUANTIDADE"),
                rs.getInt("LIMITE_MAX"), rs.getInt("LIMITE_MIN"), rs.getString("NOME"), rs.getString("DESCRICAO"), rs.getDouble("PRECO"));
                return p;
            }
            return null;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }finally{
            conn.fecharConexao();
        }
    }
    
    public ArrayList<Produto> buscarProduto(){
        Conexao conn = null;
        ArrayList<Produto> p = new ArrayList<Produto>();
        String sql = "SELECT P.NOME, P.DESCRICAO, P.COD_BARRAS, P.PRECO, C.DESC_CATEGORIA, M.DESC_MARCA, P.QUANTIDADE, P.LIMITE_MIN, P.LIMITE_MAX "
                + "FROM PRODUTO as P INNER JOIN MARCA as M ON P.COD_MARCA = M.COD_MARCA INNER JOIN CATEGORIA as C ON P.COD_CATEGORIA = C.COD_CATEGORIA"
                + " ORDER BY P.NOME";
        try{
            conn = new Conexao();
            PreparedStatement sttm = conn.getConexao().prepareStatement(sql);
            boolean result = sttm.execute();
            if(!result)
                return null;
            ResultSet rs = sttm.executeQuery();
            while(rs.next())
            p.add(new Produto(rs.getString("DESC_MARCA"), rs.getString("DESC_CATEGORIA"), rs.getString("COD_BARRAS"), rs.getInt("QUANTIDADE"),
            rs.getInt("LIMITE_MAX"), rs.getInt("LIMITE_MIN"), rs.getString("NOME"), rs.getString("DESCRICAO"), rs.getDouble("PRECO")));
            return p;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }finally{
            conn.fecharConexao();
        }
    }
    
    public boolean inserirMarca(String marca){
        Conexao conn = null;
        String sql = "INSERT INTO MARCA (DESC_MARCA) VALUES (?)";
        try{
            conn = new Conexao();
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
        Conexao conn = null;
        String sql = "SELECT COD_MARCA FROM MARCA WHERE DESC_MARCA = ?";
        try{
            conn = new Conexao();
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
        Conexao conn = null;
        String sql = "SELECT DESC_MARCA FROM MARCA WHERE COD_MARCA = ?";
        try{
            conn = new Conexao();
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
        Conexao conn = null;
        ArrayList<String> marca = new ArrayList<String>();
        String sql = "SELECT DESC_MARCA FROM MARCA";
        try{
            conn = new Conexao();
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
        Conexao conn = null;
        String sql = "INSERT INTO CATEGORIA (DESC_CATEGORIA) VALUES (?)";
        try{
            conn = new Conexao();
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
        Conexao conn = null;
        String sql = "SELECT COD_CATEGORIA FROM CATEGORIA WHERE DESC_CATEGORIA = ?";
        try{
            conn = new Conexao();
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
        Conexao conn = null;
        String sql = "SELECT DESC_CATEGORIA FROM CATEGORIA WHERE COD_CATEGORIA = ?";
        try{
            conn = new Conexao();
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
        Conexao conn = null;
        ArrayList<String> categoria = new ArrayList<String>();
        String sql = "SELECT DESC_CATEGORIA FROM CATEGORIA";
        try{
            conn = new Conexao();
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
