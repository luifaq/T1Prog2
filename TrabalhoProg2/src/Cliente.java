
public final class Cliente extends Pessoa implements CartaoFidelidade {

	private double valorCompras;

	public Cliente(String nome, Endereco endereco, String cpf, String telefone) {
		super(nome, endereco, cpf, telefone);

	}

	@Override
	public boolean clienteGold() {
		if (getValorCompras() >= 100 && getValorCompras() < 500)
			return true;
		return false;
	}

	@Override
	public boolean clientePlatinum() {
		if (getValorCompras() >= 500)
			return true;
		return false;
	}

	public double getValorCompras() {
		return valorCompras;
	}

	public void setValorCompras(double valorCompras) {
		this.valorCompras += valorCompras;
	}

}
