
public class Cliente extends Usuario {
	private String telefone;
	
	public Cliente(String nome, int cpf, String telefone){
		super(cpf, nome);
		this.telefone = telefone;
	}
	
	public String getTelefone(){
		return this.telefone;
	}
	
	public void setTelefone(String telefone){
		this.telefone = telefone;
	}
	
}
