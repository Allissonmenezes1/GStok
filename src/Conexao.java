import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexao {
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String HOST = "jdbc:mysql:://127.0.0.1/";
    private static final String BANCO = "gstok";
    private static final String USUARIO = "gstok_user";
    private static final String SENHA = "gs_p@$$*!";
    private Connection conn;
	
	public Conexao(){
		this.conn = null;
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
	
}
