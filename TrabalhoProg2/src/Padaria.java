import java.util.Scanner;

public class Padaria {
	
		Cliente[] cadastrados = new Cliente[2];
		Funcionario [] func = new Funcionario[5];
		Estoque estoque;
		Produto [] prod = new Produto[20];
		Scanner s1 = new Scanner(System.in);
		public Padaria() {
			
		
				
		

		cadastrados[0] = new Cliente("Ana", "Rua Machado Abrao, 21", "564984165165", "991646345");
		cadastrados[0] = new Cliente("Boruto", "Rua Florentino de Jesus, 348", "89494656165", "984115345");
		
		func[0] = new Padeiro("Larissa", "78966257", "Rua Machado Abrao, 21", "91318961", 1500);
		func[1] = new Padeiro("Clovis", "654822535", "Rua Florentino de Jesus, 348", "99217854", 1500);
		func[2] = new Gerente("Amanda", "2145789312", "Rua mangolia, 1238", "9874563", 2500);
		func[3] = new Vendedor("Flavio", "4158766981", "Rua Ouro Negro, 753", "9935846", 1000);
		func[4] = new Vendedor("Alberto", "654822535", "Rua Miguel Tomé, 1375", "99217854", 1000);

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

	}
		
		public boolean cadastrarCliente() {
			String nome, endereco, telefone, cpf;
			Cliente novoCliente;
			
			System.out.println("Informe o nome do cliente: ");
			nome = s1.nextLine();
			System.out.println("Informe o endereço do cliente: ");
			endereco = s1.nextLine();
			System.out.println("Informe o cpf do cliente: ");
			cpf = s1.nextLine();
			System.out.println("Informe o telefone do cliente: ");
			telefone = s1.nextLine();
			
			novoCliente = new Cliente(nome, endereco, cpf, telefone);
			
			if(isFull(cadastrados) == true)
				redimensionaVetor(cadastrados);
			for (int i = 0; i < cadastrados.length; i++) {
				if(cadastrados[i] == null) {
					cadastrados[i] = novoCliente;
					return true;
				}
			}
			
			return false;
		}
		
//		verifica se o vetor está cheio	
		public boolean isFull(Object[] vetor) {
			for (int i = 0; i < vetor.length; i++) 
				if(vetor[i] == null)
					return false;
			return true;
		}
//		redimensiona o vetor	
		public void redimensionaVetor(Object[] vetor) {
			Object[] aux = new Object[vetor.length + 1];
			for (int i = 0; i < aux.length; i++)
				aux[i] = vetor[i];
			vetor = aux;
		}
}
