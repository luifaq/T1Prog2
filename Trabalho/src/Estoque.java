


public class Estoque {

	protected Produto[] estoque;
	
	public Estoque(Produto produto) {
		
		this.estoque = new Produto[50];
	}
	
	public boolean addProduto(Produto produto) {
		
		for(int i = 0; i < estoque.length; i++) {
			
			if(estoque[i] == null) {
				
				estoque[i] = produto;
				
				return true;
			}
		}
		
		return false;
	}
	public boolean removerProduto(Produto produto) {
		
		for(int i = 0; i < estoque.length; i++) {
			
			if(estoque[i] == produto) {
				
				estoque[i] = null;
				return true;
			}
		}
		
		return false;
	}
	public boolean verificarEstoque(Produto produto) {
		
		for(int i = 0; i < estoque.length;i++) {
			
			if(estoque[i] != null) {
				
				if(estoque[i] == produto) {
					
					return true;
				}
			}
		}
		return false;
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
