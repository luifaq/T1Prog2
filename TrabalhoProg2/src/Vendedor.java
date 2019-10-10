

public class Vendedor extends Funcionario{

	  private Vendas[] vendas;
	  private double meta;
	  
	
	public Vendedor(String nome, String cpf, Endereco endereco, String telefone, double salario) {
		super(nome, cpf, endereco, telefone, salario);
		
//		this.setVendas(0);
	}


	public void addVendas(Vendas novaVenda) {
		if(isFull(vendas))
			redimensionaVetor(vendas);
		for (int i = 0; i < vendas.length; i++)
			if(vendas[i] == null)
				vendas[i] = novaVenda;
	}


	public double valorTotalVendas(Vendas[] vendas) {
		double valorTotalVendas = 0;
		for (int i = 0; i < vendas.length; i++) {
			valorTotalVendas += vendas[i].calcularVendas();
		}
		return valorTotalVendas;
	}
//  ??????????????????????????
//	public boolean realizaVenda() {
//		
//		this.vendas++;
//		
//		if(this.vendas == meta) {
//	
//			this.setSalario(this.getSalario() + this.getSalario() * 0.10);
//		}
//		return true;
//	}


	public double getMeta() {
		return meta;
	}


	public void setMeta(int meta) {
		this.meta = meta;
	}
	
	public boolean isFull(Vendas[] vetor) {
		for (int i = 0; i < vetor.length; i++) 
			if(vetor[i] == null)
				return false;
		return true;
	}
	
	public void redimensionaVetor(Vendas[] vetor) {
		Vendas[] aux = new Vendas[vetor.length + 1];
		for (int i = 0; i < aux.length; i++)
			aux[i] = vetor[i];
		vetor = aux;
	}
}
