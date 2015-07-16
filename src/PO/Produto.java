package PO;


public class Produto {
	private int codBarras, quantidade, limiteMax, limiteMin; 
	private String nome, descricao, marca, categoria; 
	private double preco;
	
	public Produto(String marca, String categoria, int barras, int qtd, int limMax, int limMin, 
					String nome, String descricao, double preco){
		this.marca = marca;
		this.categoria = categoria;
		this.codBarras = barras;
		this.quantidade = qtd;
		this.limiteMax = limMax;
		this.limiteMin = limMin;
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
	}
	
	public Produto(String marca, String categoria, int barras, int qtd, int limMax, int limMin, 
			String nome,  double preco){
		this.marca = marca;
		this.categoria = categoria;
		this.codBarras = barras;
		this.quantidade = qtd;
		this.limiteMax = limMax;
		this.limiteMin = limMin;
		this.nome = nome;
		this.descricao = null;
		this.preco = preco;
	}
	
	public Produto(Produto p){
		this.marca = p.getCodMarca();
		this.categoria = p.getCategoria();
		this.codBarras = p.getCodBarras();
		this.quantidade = p.getQuantidade();
		this.limiteMax = p.getLimiteMaximo();
		this.limiteMin = p.getLimiteMinimo();
		this.nome = p.getNome();
		this.descricao = p.getDescricao();
		this.preco = p.getPreco();

	}
	
	public void setPreco(double preco){
		this.preco = preco;
	}
	
	public void setQuantidade(int qtd){
		this.quantidade = qtd;
	}
	
	public String getCodMarca(){
		return this.marca;
	}
	
	public String getCategoria(){
		return this.categoria;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public int getCodBarras(){
		return this.codBarras;
	}
	
	public int getQuantidade(){
		return this.quantidade;
	}
	
	public double getPreco(){
		return this.preco;
	}
	
	public int getLimiteMaximo(){
		return this.limiteMax;
	}
	
	public int getLimiteMinimo(){
		return this.limiteMin;
	}
	
	public String getDescricao(){
		return this.descricao;
	}
	
}