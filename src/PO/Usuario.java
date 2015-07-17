package PO;


public class Usuario {
		private String nome, cpf;
		
		public Usuario(String cpf, String nome){
			this.cpf = cpf;
			this.nome = nome;			
		}
		
		public String getNome(){
			return this.nome;
		}
		
		public String getCPF(){
			return this.cpf;
		}
}
