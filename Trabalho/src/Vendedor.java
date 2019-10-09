

public class Vendedor extends Funcionario{

	  private int vendas;
	  private int meta;
	  
	
	public Vendedor(String nome, String cpf, Endereco endereco, String telefone, double salario) {
		super(nome, cpf, endereco, telefone, salario);
		
		this.setVendas(0);
	}


	public int getVendas() {
		return vendas;
	}


	public void setVendas(int vendas) {
		this.vendas = vendas;
	}

	public boolean realizaVenda() {
		
		this.vendas++;
		
		if(this.vendas == meta) {
	
			this.setSalario(this.getSalario() + this.getSalario() * 0.10);
		}
		return true;
	}


	public int getMeta() {
		return meta;
	}


	public void setMeta(int meta) {
		this.meta = meta;
	}
}
