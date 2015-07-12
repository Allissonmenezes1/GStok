
public class Funcionario {
		private int cpf;
		private String nome;
		
		public Funcionario(int cpf, String nome){
			this.cpf = cpf;
			this.nome = nome;			
		}
		
		public String getNome(){
			return this.nome;
		}
		
		public int getCPF(){
			return this.cpf;
		}
}
