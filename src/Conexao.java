import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexao {
	private Connection conn;
	
	public Conexao(){
		this.conn = null;
	}
	
	public Connection getConexao() throws SQLException, ClassNotFoundException{
		Class.forName("com.mysql.jdbc.Driver");
		this.conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1/gstok","gstok_user","gs_p@$$*!");
		return this.conn;
	}
	
}
