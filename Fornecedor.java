
public class Fornecedor {
	private String nome;
	private Endereco endereco;
	private String cnpj;
	private Produto [] fornecido;
	private int qntFornecidos;//quantidade de produtos fornecidos
	
	public Fornecedor(String nome,Endereco endereco,String cnpj,Produto fornecido,
			int qntFornecidos) {
		this.nome =nome;
		this.endereco= endereco;
		this.cnpj = cnpj;
		this.qntFornecidos = qntFornecidos;
		this.fornecido =   new Produto[qntFornecidos];
		this.fornecido[0] = fornecido;// add ao menos 1 produto 
		
	}
	// add produtos caso 1 fornecedor forneça mais de 1 produto
	public boolean addProdutoFornecido(Produto fornecido) {
		for (int i = 0; i < this.fornecido.length; i++) {
			if(this.fornecido[i] == null) {
				this.fornecido[i] = fornecido; 
				return true;
			}
				
		}return false;
	}
	//remove da lista de produtos fornecidos
	public boolean removeProdutoFornecido(Produto fornecido) {
		for (int i = 0; i < this.fornecido.length; i++) {
			if(this.fornecido[i].equals(fornecido)) {
				this.fornecido[i] = null;
				return true;
			}
		}return false;
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
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public Produto[] getFornecido() {
		return fornecido;
	}
	public Produto getFornecido(int i) {
		return fornecido[i];
	}
	public void setFornecido(Produto[] fornecido) {
		this.fornecido = fornecido;
	}
	public int getQntFornecidos() {
		return qntFornecidos;
	}
	public void setQntFornecidos(int qntFornecidos) {
		this.qntFornecidos = qntFornecidos;
	}
	
	
}
