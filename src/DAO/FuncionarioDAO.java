package DAO;

import PO.Funcionario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import util.Conexao;

public class FuncionarioDAO {
    
    public boolean inserirFuncionario(Funcionario funcionario){
        Conexao conn = new Conexao();
        String sql = "INSERT INTO FUNCIONARIO(CPF, NOME, SENHA, GERENTE) VALUES (?, ?, ?, ?)";
        try{
            PreparedStatement sttm = conn.getConexao().prepareStatement(sql);
            sttm.setString(1, funcionario.getCPF());
            sttm.setString(2, funcionario.getNome());
            sttm.setString(3, funcionario.getSenha());
            int gerente = (funcionario.getGerente())? 1 : 0;
            sttm.setInt(4, gerente);
            sttm.execute();
            return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            conn.fecharConexao();
        }  
    }
    
    public Funcionario getFuncionario(String cpf){
        Conexao conn = new Conexao();
        String sql = "SELECT * FROM CLIENTE WHERE CPF = ?";
        try{
            PreparedStatement sttm = conn.getConexao().prepareStatement(sql);
            sttm.setString(1, cpf);;
            boolean result = sttm.execute();
            if(!result)
                return null;
            ResultSet rs = sttm.executeQuery();
            rs.next();
            Funcionario func = new Funcionario(rs.getString("NOME"), rs.getString("CPF"), rs.getString("SENHA"));
            boolean gerente = (rs.getInt("GERENTE") == 1)? true : false;
            func.setGerente(gerente);
            return func;
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }finally{
            conn.fecharConexao();
        }
    }
}
