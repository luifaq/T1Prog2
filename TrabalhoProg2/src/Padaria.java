import java.util.Scanner;

public class Padaria {

	public static void main(String[] args) {
		Funcionario func[] = new Funcionario[5];
		Estoque estoque;
		Endereco end[] = new Endereco[5];
		Produto prod[] = new Produto[20];
		Scanner sc1 = new Scanner(System.in);
		end[0] = new Endereco("Rua Machado Abrao", "21", "São José", "79035789", "Campo Grande");
		end[1] = new Endereco("Rua Florentino de Jesus", "348", "São José", "79035180", "Campo Grande");
		end[2] = new Endereco("Rua Mangolia", "1238", "São José", "79035436", "Campo Grande");
		end[3] = new Endereco("Rua Ouro Negro", "753", "São José", "79035804", "Campo Grande");
		end[4] = new Endereco("Rua Miguel Tomé", "1375", "São José", "79035350", "Campo Grande");

		func[0] = new Padeiro("Larissa", "78966257", end[0], "91318961", 1500);
		func[1] = new Padeiro("Clovis", "654822535", end[1], "99217854", 1500);
		func[2] = new Gerente("Amanda", "2145789312", end[2], "9874563", 2500);
		func[3] = new Vendedor("Flavio", "4158766981", end[3], "9935846", 1000);
		func[4] = new Vendedor("Alberto", "654822535", end[4], "99217854", 1000);

		prod[0] = new Produto("000001", "Pao", 0.5, true, 30);
		prod[1] = new Produto("000002", "Sonho", 2, true, 5);
		prod[2] = new Produto("000003", "Croaasant de Cheddar", 4.5, true, 5);
		prod[3] = new Produto("000004", "Croassant de Presunto e Queijo", 4.5, true, 5);
		prod[4] = new Produto("000005", "Croassant de Quatro Queijos", 4.5, true, 5);
		prod[5] = new Produto("000006", "Pão de Queijo ", 3.5, true, 30);
		prod[6] = new Produto("000007", "Enroladinho de Presunto e Queijo ", 3.5, true, 5);
		prod[7] = new Produto("000008", "Enroladinho de Salsicha", 3.5, true, 5);
		prod[8] = new Produto("000009", "Folheado de Frango com Catupiry", 4.5, true, 5);
		prod[9] = new Produto("0000010", "Folheado de Presunto e Queijo", 4.5, true, 5);
		prod[10] = new Produto("000011", "Folheado de Carne Seca", 5.0, true, 5);
		prod[11] = new Produto("000012", "Bolo de banana", 20, true, 5);
		prod[12] = new Produto("000013", "Bolo de Aniversario", 60, true, 5);
		prod[13] = new Produto("000014", "Bolo de chocolate", 30, true, 5);
		prod[14] = new Produto("000015", "Bolo 2Amores", 40, true, 5);
		prod[15] = new Produto("000016", "Bolo Romeu e Julieta", 40, true, 5);
		prod[16] = new Produto("000017", "Bolo de cenoura", 30, true, 5);
		prod[17] = new Produto("000018", "Coca Cola Lata 290 ml", 3.5, true, 5);
		prod[18] = new Produto("000019", "Coca Cola 1L", 5, true, 5);
		prod[19] = new Produto("000020", "Suco Dell Vale 1L", 8.5, true, 5);
		
		estoque = new Estoque(prod);
		/*
		 * do { System.out.println("-----Padaria Trem Bao-----");
		 * System.out.println("Escolha a sua opção");
		 * System.out.println("Iniciar uma compra - Digite 1");
		 * System.out.println("Finalizar  uma compra - Digite 2");
		 * System.out.println("Realizar uma compra - Digite 3"); switch() {
		 * 
		 * }
		 * 
		 * }while(resposta.equalsIgnoreCase("sim"));
		 */

		sc1.close();
	}

}
