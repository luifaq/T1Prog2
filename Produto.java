package Trabalho.org;

public class Produto {

	protected  int cod;
	protected String nome;
	protected double preco;
	protected String apelido;
	protected int[] unidades;
	
	public Produto(int cod, String nome, double preco){
		
	    this.unidades = new int[30];
		this.cod = cod;
		this.nome = nome;
		this.preco = preco;
		
	}

	public int getCod() {
		return this.cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public int[] getUnidades() {
		return unidades;
	}

	public void setUnidades(int[] unidades) {
		this.unidades = unidades;
	}
	
	
}
