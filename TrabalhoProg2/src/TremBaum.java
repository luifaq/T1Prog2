import java.util.Scanner;

public class TremBaum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Padaria loja = new Padaria();
		 int num;
		 String aux;
		do {
			loja.imprimeMenu();
			num = sc.nextInt();
			switch (num) {
			case 1:
				//System.out.println("Realizar vendas");
				
				break;
			case 2:
				//System.out.println("Cadastrar Cliente");
				
				break;
			case 3:
				//System.out.println("Cadastrar Produto");
				 loja.cadastrarProduto();
				break;
			case 4:
				//System.out.println("Cadastrar Funcionário");
				
				break;

			default:
				break;
			}
			System.out.println("Deseja continuar");
			aux=sc.nextLine();
		}while(!(aux.equalsIgnoreCase("Sim")));
	}

}
