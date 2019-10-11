

public class Padeiro extends Funcionario{
	double horasNoturnas;
	
	public Padeiro(String nome, String cpf, String endereco, String telefone, double salario) {
		super(nome, cpf, endereco, telefone, salario);
		this.horasNoturnas = 0;
	}
	
	public boolean jornadaNoturna() {
		this.setSalario(this.getSalario()+(this.getSalario() * 0.25) * horasNoturnas);
		return true;
	}

	public double getHorasNoturnas() {
		return horasNoturnas;
	}

	public void setHorasNoturnas(double horasNoturnas) {
		this.horasNoturnas = horasNoturnas;
	}

	public void imprimeRelatorio() {
		super.imprimeRelatorio();
		System.out.println("Bonificação: "+ ((super.getSalario()*0.25)*horasNoturnas));
	}
}
