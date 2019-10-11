import java.util.Scanner;

public class Endereco {

	private String rua, numero, bairro, cep, cidade;

	public Endereco(String rua, String numero, String bairro, String cep, String cidade) {
		
		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
		this.cep = cep;
		this.cidade = cidade;
	}
	
	public Endereco cadastrarEndereco() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nome da rua");
		String rua = sc.nextLine(); 
		System.out.println("Numero ");
		String numero = sc.nextLine();
		System.out.println("Bairro");
		String bairro = sc.nextLine();
		System.out.println("CEP");
		String cep = sc.nextLine();
		System.out.println("Cidade");
		String cidade = sc.nextLine();
		
		Endereco novo = new Endereco(rua,numero,bairro,cep,cidade);
		return novo;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	
	
	
}
