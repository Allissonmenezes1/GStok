package DAO;

import PO.Cliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import util.Conexao;

public class ClienteDAO {
    
    public boolean inserirCliente(Cliente cliente){
        Conexao conn = null;
        String sql = "INSERT INTO CLIENTE (CPF, NOME, TELEFONE) VALUES (?, ?, ?)";
        try{
            conn = new Conexao();
            PreparedStatement sttm = conn.getConexao().prepareStatement(sql);
            sttm.setString(1, cliente.getCPF());
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
    
    public Cliente getCliente(String cpf){
        Conexao conn = null;
        String sql = "SELECT * FROM CLIENTE WHERE CPF = ?";
        try{
            conn = new Conexao();
            PreparedStatement sttm = conn.getConexao().prepareStatement(sql);
            sttm.setString(1, cpf);;
            boolean result = sttm.execute();
            if(!result)
                return null;
            ResultSet rs = sttm.executeQuery();
            rs.next();
            Cliente cliente = new Cliente(rs.getString("NOME"), rs.getString("CPF"), rs.getString("TELEFONE")); 
            return cliente;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }finally{
            conn.fecharConexao();
        }
    }
    
}
