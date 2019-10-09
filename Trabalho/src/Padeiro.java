

public class Padeiro extends Funcionario{

	public Padeiro(String nome, String cpf, Endereco endereco, String telefone, double salario) {
		super(nome, cpf, endereco, telefone, salario);
		// TODO Auto-generated constructor stub
	}
	
	public boolean jornadaNoturna(int horastrabalhadas) {
		this.setSalario((this.getSalario()+this.getSalario() * 0.25) * horastrabalhadas);
		return true;
	}

}
