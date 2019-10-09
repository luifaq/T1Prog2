

public class Vendas {

	private Produto produtos[] = new Produto[20];
	private String dataVenda;
	private Vendedor vendedor;
	private int formaPagamento;
	private boolean tipoPagamento;
	
	public Vendas(Produto[] produtos, String dataVenda, Vendedor vendedor, int formaPagamento, boolean tipoPagamento) {
		this.produtos = produtos;
		this.dataVenda = dataVenda;
		this.vendedor = vendedor;
		this.formaPagamento = formaPagamento;
		this.tipoPagamento = tipoPagamento;
		this.vendedor.realizaVenda();
	}

	public Produto[] getProdutos() {
		return produtos;
	}

	public void setProdutos(Produto[] produtos) {
		this.produtos = produtos;
	}

	public String getDataVenda() {
		return dataVenda;
	}

	public void setDataVenda(String dataVenda) {
		this.dataVenda = dataVenda;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public int getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(int formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public boolean isTipoPagamento() {
		return tipoPagamento;
	}

	public void setTipoPagamento(boolean tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	} 
	
	public double calcularVendas() {
		
		double precoTotal = 0;
		
		for (int i = 0; i < produtos.length; i++) {
			
			precoTotal += produtos[i].getPreco();
			
		}
		
		if(tipoPagamento == true) {
			
			precoTotal += precoTotal * 0.02;
			
		}
		
		return precoTotal;
	}
	
	public double parcelas(int parcelas) {
		
		double valorParcelado = 0;
		
		if(tipoPagamento == true) {
			
			valorParcelado =  this.calcularVendas() / parcelas;
		}
		
		return valorParcelado;
	}

}
