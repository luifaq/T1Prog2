
public abstract class Funcionario extends Pessoa{

	private double salario;
	
	public Funcionario(String nome, String cpf, Endereco endereco, String telefone, double salario) {
		super( nome,  endereco,  cpf,  telefone);
		
		this.salario = salario;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public void imprimeRelatorio() {
		super.imprimeRelatório();
		System.out.println("Salário:" + this.salario);
	}
	
}
