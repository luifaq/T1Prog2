public class Vendedor extends Funcionario{

	  private Vendas[] vendas;
	  private double meta;
	  
	
	public Vendedor(String nome, String cpf, String endereco, String telefone, double salario) {
		super(nome, cpf, endereco, telefone, salario);
		
//		this.setVendas(0);
	}

//	verifica se o vendedor atingiu sua meta de vendas
	public boolean atingiuMeta() {
		if(valorTotalVendas(vendas) >= meta)
			return true;
		return false;
	}
	
//	adiciona uma venda ao vendedor	
	public void addVendas(Vendas novaVenda) {
		if(isFull(vendas))
			redimensionaVetor(vendas);
		for (int i = 0; i < vendas.length; i++)
			if(vendas[i] == null)
				vendas[i] = novaVenda;
	}

//	calcula o total das vendas do vendedor
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
//	verifica se o vetor está cheio	
	public boolean isFull(Vendas[] vetor) {
		for (int i = 0; i < vetor.length; i++) 
			if(vetor[i] == null)
				return false;
		return true;
	}
//	redimensiona o vetor	
	public void redimensionaVetor(Vendas[] vetor) {
		Vendas[] aux = new Vendas[vetor.length + 1];
		for (int i = 0; i < aux.length; i++)
			aux[i] = vetor[i];
		vetor = aux;
	}
	
	public void imprimeRelatorio() {
		super.imprimeRelatorio();
		if(atingiuMeta())
		System.out.println("Bonificação: "+ (super.getSalario()*0.10));
	}
}
