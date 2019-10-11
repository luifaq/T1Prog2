

public class Gerente extends Funcionario {

	public Gerente(String nome, String cpf, String endereco, String telefone, double salario) {
		super(nome, cpf, endereco, telefone, salario);
		this.setSalario(this.getSalario()+ this.getSalario() * 0.20);
	}
	public void imprimeRelatorio() {
		super.imprimeRelatorio();
		System.out.println("Bonificação: "+ (super.getSalario()*0.20));
	}
}
