


public class Estoque {

	protected Produto[] estoque;
	protected int contProdutos;
	
	public Estoque(Produto produto) {
		
		this.estoque = new Produto[50];
		this.contProdutos = 0;
	}
	//Adiciona o Tipo do produto no estoque - Felipe
	public boolean addTipoProduto(Produto produto) {
		if(verificarEstoque(produto)!=-1 && this.contProdutos<50) {
			produto.addProduto();
			this.contProdutos++;
			return true;
		}else if(this.contProdutos<50){
			for(int i = 0; i < estoque.length; i++) {
				
				if(estoque[i] == null) {
					
					estoque[i] = produto;
					this.contProdutos++;
					return true;
				}
			}
			
		}
		
		return false;
	}
	//Remove um tipo de produto do estoque - Felipe
	public boolean removerTipoProduto(Produto produto) {
		
		for(int i = 0; i < estoque.length; i++) {
			
			if(estoque[i].equals(produto)) {
				
				estoque[i] = null;
				this.contProdutos--;
				
				return true;
			}
		}
		
		return false;
	}
	//Verifica se o tipo do produto ja existe no estoque se sim retorna a posiçao[i] onde foi encontrado e -1 se nao existir
	// - Felipe
	public int verificarEstoque(Produto produto) {
		
		for(int i = 0; i < estoque.length;i++) {
			
			if(estoque[i] != null) {
				
				if(estoque[i].equals(produto)) {
					
					return i;
				}
			}
		}
		return -1;
	}
	
	public void printarEstoque() {
		
		for(int i = 0; i < estoque.length; i++) {
			
			System.out.print(estoque[i].getApelido());
			System.out.print(estoque[i].getNome());
			System.out.print(estoque[i].getCod());
			System.out.print(estoque[i].getPreco());
			
		}
	}
}
