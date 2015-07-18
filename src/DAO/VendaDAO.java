
package DAO;

import PO.Produto;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import util.Conexao;

public class VendaDAO {
    
    public boolean inserirVenda(String codBarras, String cpfFunc, String cpfCliente, int quantidade, String idVenda, double preco, Conexao conn){
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
            
            query = "INSERT INTO VENDA (ID, ID_PRODUTO, CPF_FUNC, CPF_CLIENTE, QUANTIDADE, PRECO_UNITARIO)"
                    + " VALUES (?, ?, ?, ?, ?, ?)";
            sttm = conn.getConexao().prepareStatement(query);
            sttm.setString(1, idVenda);
            sttm.setInt(2, idProduto);
            sttm.setString(3, cpfFunc);
            sttm.setString(4, cpfCliente);
            sttm.setInt(5, quantidade);
            sttm.setDouble(6, preco);
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
        }
    }
    
    public ArrayList maisVendidos(){
        ArrayList<Object[]> resultados = new ArrayList();
        Conexao conn = null;
        String sql = "SELECT P.COD_BARRAS, P.NOME, P.DESCRICAO, COUNT(V.ID_PRODUTO) as UNIDADES_VENDIDAS, TRUNCATE(SUM(V.QUANTIDADE*V.PRECO_UNITARIO), 2) as  TOTAL \n"
           + "FROM VENDA as V INNER JOIN PRODUTO as P ON V.ID_PRODUTO = P.ID GROUP BY (V.ID_PRODUTO) ORDER BY (TOTAL) DESC";
        try{
            conn = new Conexao();
            PreparedStatement sttm = conn.getConexao().prepareStatement(sql);
            sttm.execute();
            ResultSet rs = sttm.getResultSet();
            
            while(rs.next()){
                resultados.add(new Object[]{rs.getString("COD_BARRAS"), rs.getString("NOME"), rs.getString("DESCRICAO"), rs.getInt("UNIDADES_VENDIDAS"), rs.getDouble("TOTAL")});
            }
           
            if(resultados.isEmpty())
                return null;
            return resultados;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }finally{
            conn.fecharConexao();
        }
    }
    
    public ArrayList maioresCompras(){
        ArrayList<Object[]> resultados = new ArrayList();
        Conexao conn = null;
        String sql = "SELECT DATE_FORMAT(V.DATA, \"%d/%m/%Y\") as DATA, F.NOME, SUM(V.QUANTIDADE) as QUANTIDADE, TRUNCATE(SUM(V.QUANTIDADE*V.PRECO_UNITARIO), 2) as TOTAL \n"
                    + "FROM VENDA as V INNER JOIN FUNCIONARIO as F ON V.CPF_FUNC = F.CPF GROUP BY (V.ID) ORDER BY (TOTAL) DESC";
        try{
            conn = new Conexao();
            PreparedStatement sttm = conn.getConexao().prepareStatement(sql);
            sttm.execute();
            ResultSet rs = sttm.getResultSet();
           
            while(rs.next()){
                resultados.add(new Object[]{rs.getString("DATA"), rs.getString("NOME"), rs.getInt("QUANTIDADE"), rs.getDouble("TOTAL")});
            }
           
            if(resultados.isEmpty())
                return null;
            return resultados;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }finally{
            conn.fecharConexao();
        }
    }
    
    public ArrayList maioresClientes(){
        ArrayList<Object[]> resultados = new ArrayList();
        Conexao conn = null;
        String sql = "SELECT C.NOME, COUNT(DISTINCT V.ID) as QUANTIDADE, SUB.TOTAL \n" +
                    "FROM VENDA as V INNER JOIN CLIENTE as C ON V.CPF_CLIENTE = C.CPF INNER JOIN\n" +
                    "(SELECT CPF_CLIENTE, TRUNCATE(SUM(PRECO_UNITARIO*QUANTIDADE), 2) AS TOTAL \n" +
                    "FROM VENDA GROUP BY(CPF_CLIENTE) ORDER BY TOTAL DESC) as SUB \n" +
                    "ON V.CPF_CLIENTE = SUB.CPF_CLIENTE GROUP BY(V.CPF_CLIENTE) ORDER BY(SUB.TOTAL)";
        try{
            conn = new Conexao();
            PreparedStatement sttm = conn.getConexao().prepareStatement(sql);
            sttm.execute();
            ResultSet rs = sttm.getResultSet();
           
            while(rs.next()){
                resultados.add(new Object[]{rs.getString("NOME"), rs.getInt("QUANTIDADE"), rs.getDouble("TOTAL")});
            }
           
            if(resultados.isEmpty())
                return null;
            return resultados;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }finally{
            conn.fecharConexao();
        }
    }
}
