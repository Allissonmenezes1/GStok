
public class Produto {
	private int codMarca, codCategoria, codBarras, quantidade, limiteMax, limiteMin; 
	private String nome, descricao; 
	private double preco;
	
	public Produto(int marca, int categoria, int barras, int qtd, int limMax, int limMin, 
					String nome, String descricao, double preco){
		this.codMarca = marca;
		this.codCategoria = categoria;
		this.codBarras = barras;
		this.quantidade = qtd;
		this.limiteMax = limMax;
		this.limiteMin = limMin;
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
	}
	
	public Produto(int marca, int categoria, int barras, int qtd, int limMax, int limMin, 
			String nome,  double preco){
		this.codMarca = marca;
		this.codCategoria = categoria;
		this.codBarras = barras;
		this.quantidade = qtd;
		this.limiteMax = limMax;
		this.limiteMin = limMin;
		this.nome = nome;
		this.preco = preco;
	}
	
	public void setPreco(double preco){
		this.preco = preco;
	}
}