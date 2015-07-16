package PO;


public class Usuario {
		private int cpf;
		private String nome;
		
		public Usuario(int cpf, String nome){
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
