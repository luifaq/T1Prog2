
public class FornecedorRecorrente extends Fornecedor {
	private double taxa;
	
	public FornecedorRecorrente(String nome, Endereco endereco, String cnpj, Produto fornecido, int qntFornecidos,double taxa) {
		super(nome, endereco, cnpj, fornecido, qntFornecidos);
		this.taxa = taxa;
		attPreco();
	}
	
	public void attPreco() {
		for (int i = 0; i < super.getFornecido().length; i++) {
			if(super.getFornecido(i)!=null) {
				getFornecido(i).setPreco(getFornecido(i).preco+(getFornecido(i).preco*this.taxa));
				
			}
		}
		
	}

}
