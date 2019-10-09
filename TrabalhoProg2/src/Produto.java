

public class Produto {

	protected  int cod;
	protected String nome;
	protected double preco;
	protected String apelido;
	protected int contunidades;//contador de unidades existentes do produto - Felipe
	protected boolean perecivel;
	
	public Produto(int cod, String nome, double preco,boolean perecivel){
		
	    this.contunidades = 1;
		this.cod = cod;
		this.nome = nome;
		this.preco = preco;
		this.perecivel = perecivel;
		
		
	}
	// Metodo para adicionar uma quatidade especifica passada por paramêtro - Felipe
	public void addProduto(int qnt) {
		if(this.contunidades < 30 && (this.contunidades + qnt)<=30) {
			setContUnidades(qnt);
		}else
			System.out.println("Espaço insuficiente");
	}
	//Metodo que adiciona de uma unidade - Felipe
	public void addProduto() {
		if(this.contunidades < 30) {
			this.contunidades++;
		}
	}
	//Remove produtos por quantidade especifica - Felipe
	public void removeProduto(int qnt) {
		if( (this.contunidades - qnt)>=0) {
			setContUnidades((this.contunidades - qnt));
		}
	}
	//Decrementa produto de 1 em 1 - Felipe
	public void removeProduto() {
		if(this.contunidades > 0) {
			this.contunidades--;
		}
		if(this.contunidades <= 1)
			System.out.println("ALERTA - ESTOQUE ESCAÇO");
	}
	//Verifica se os produtos são iguais atraves do codigo e nome do produto - Felipe
	public boolean equals(Produto a) {
		if(a.cod == this.cod && a.nome.equalsIgnoreCase(this.nome)) {
			return true;
		}return false;
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

	public int getContUnidades() {
		return contunidades;
	}

	private void setContUnidades(int unidades) {
		this.contunidades += unidades;
	}
	
	
}
