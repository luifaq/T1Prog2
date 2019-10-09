

public class Gerente extends Funcionario {

	public Gerente(String nome, String cpf, Endereco endereco, String telefone, double salario) {
		super(nome, cpf, endereco, telefone, salario);
		// TODO Auto-generated constructor stub
	}
	public boolean aumentaconfianca() {
		this.setSalario(this.getSalario()+ this.getSalario() * 0.20);
		return true;
	}
}
