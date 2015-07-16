package DAO;

import PO.Cliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import util.Conexao;

public class ClienteDAO {
    
    public boolean inserirCliente(Cliente cliente){
        Conexao conn = new Conexao();
        String sql = "INSERT INTO CLIENTE (CPF, NOME, TELEFONE) VALUES (?, ?, ?)";
        try{
            PreparedStatement sttm = conn.getConexao().prepareStatement(sql);
            sttm.setInt(1, cliente.getCPF());
            sttm.setString(2, cliente.getNome());
            sttm.setString(3, cliente.getTelefone());
            sttm.execute();
            return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            conn.fecharConexao();
        }
    }
    
    public Cliente getCliente(int cpf){
        Conexao conn = new Conexao();
        String sql = "SELECT * FROM CLIENTE WHERE CPF = ?";
        try{
            PreparedStatement sttm = conn.getConexao().prepareStatement(sql);
            sttm.setInt(1, cpf);;
            boolean result = sttm.execute();
            if(!result)
                return null;
            ResultSet rs = sttm.executeQuery();
            rs.next();
            Cliente cliente = new Cliente(rs.getString("NOME"), rs.getInt("CPF"), rs.getString("TELEFONE")); 
            return cliente;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }finally{
            conn.fecharConexao();
        }
    }
    
}