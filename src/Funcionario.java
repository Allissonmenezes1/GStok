
public class Funcionario extends Usuario {
	private String senha;
	private boolean gerente;
	
	public Funcionario(String nome, int cpf, String senha){
		super(cpf, nome);
		this.senha = senha;
		this.gerente = false;
	}
	
	public boolean getGerente(){
		return this.gerente;
	}
	
	public void setGerente(boolean i){
		this.gerente = i;
	}
	
	public String getSenha(){
		return this.senha;
	}
	
	public void setSenha(String senha){
		this.senha = senha;		
	}
}
