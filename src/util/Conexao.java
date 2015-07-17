package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexao {
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String HOST = "jdbc:mysql://127.0.0.1/";
    private static final String BANCO = "gstok";
    private static final String USUARIO = "gstok_user";
    private static final String SENHA = "gs_p@$$*!";
    private Connection conn;
    private Savepoint savepoint;
	
    public Conexao(){
	this.conn = null;
        this.savepoint = null;
    }
	
    public Connection getConexao() {
               
        try {
            Class.forName(DRIVER);
            this.conn = DriverManager.getConnection(HOST+BANCO, USUARIO, SENHA);
            return this.conn;
        } catch (Exception e) {
            e.printStackTrace();
        }
               
        return null;
               
    }
       
    public void fecharConexao(){
        if( this.conn != null ){
            try {
                this.conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    public void savepoint(){
        try {
            this.savepoint = this.conn.setSavepoint();
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void rollback(){
        try {
            this.conn.rollback(this.savepoint);
        } catch (SQLException ex) {
            Logger.getLogger(Conexao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
