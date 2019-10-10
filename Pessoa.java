
public abstract class Pessoa implements Relatorio {
	private String nome;
	private Endereco endereco;
	private String cpf;
	private String telefone;
	
	public Pessoa(String nome, Endereco endereco, String cpf, String telefone) {
		this.nome = nome;
		this.endereco = endereco;
		this.cpf = cpf;
		this.telefone = telefone;
	}
	@Override
	public void imprimeRelatorio() {
		System.out.println();
		System.out.println("-------Relaótio-------");
		System.out.println();
		System.out.println("Nome: " + this.nome);
		System.out.println("Endereço: " + this.endereco);
		System.out.println("CPF : " + this.cpf);
		System.out.println("Telefone: " + this.telefone);

	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
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
