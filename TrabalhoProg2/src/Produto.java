import java.util.Scanner;

public class Produto {

	protected  String cod;
	protected String nome;
	protected double preco;
	protected String apelido;
	protected int contunidades;//contador de unidades existentes do produto - Felipe
	protected boolean perecivel;
	
	public Produto(String cod, String nome, double preco,boolean perecivel){
		
	    this.contunidades = 1;
		this.cod = cod;
		this.nome = nome;
		this.preco = preco;
		this.perecivel = perecivel;
		
		
	}
//	cadastra um novo produto
	public Produto cadastrarProduto() {
		Scanner s1 = new Scanner(System.in);
		String resposta;
		System.out.println("Informe o nome do produto: ");
		nome = s1.nextLine();
		System.out.println("Informe o código do produto: ");
		cod = s1.nextInt();
		s1.nextLine();
		System.out.println("Informe o preço do produto: ");
		s1.hasNextDouble();
		System.out.println("O produto é perecivel?");
		resposta = s1.nextLine();
		if(resposta.equalsIgnoreCase("sim"))
			perecivel = true;
		else
			perecivel = false;
		
		s1.close();
		
		Produto novoProduto = new Produto(cod, resposta, preco, perecivel);
		return novoProduto;
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
