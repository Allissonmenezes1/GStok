package PO;


public class Funcionario extends Usuario {
	private String senha;
	private boolean gerente;
	
	public Funcionario(String nome, String cpf, String senha){
		super(cpf, nome);
		this.senha = senha;
		this.gerente = false;
	}
	
        public Funcionario(Funcionario funcionario){
		super(funcionario.getCPF(), funcionario.getNome());
		this.senha = funcionario.getSenha();
		this.gerente = funcionario.getGerente();
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
