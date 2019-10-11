
public abstract class Pessoa implements Relatorio {
	private String nome;
	private String endereco;
	private String cpf;
	private String telefone;
	
	public Pessoa(String nome, String endereco, String cpf, String telefone) {
		this.nome = nome;
		this.endereco = endereco;
		this.cpf = cpf;
		this.telefone = telefone;
	}
	@Override
	public void imprimeRelatorio() {
		System.out.println();
		System.out.println("-------Rela�tio-------");
		System.out.println();
		System.out.println("Nome: " + this.nome);
		System.out.println("Endere�o: " + this.endereco);
		System.out.println("CPF : " + this.cpf);
		System.out.println("Telefone: " + this.telefone);

	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	

}
