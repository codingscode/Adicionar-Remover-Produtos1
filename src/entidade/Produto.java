package entidade;

public class Produto {

	public String nome;
	public double preco;
	public int quantidade;

	public double valortotalestoque () {
	  return preco*quantidade;
	}

	public void addprodutos (int quantidade) {
	    this.quantidade += quantidade;
	}

	public void removerquantidade(int quantidade) {
	    this.quantidade -= quantidade;
	}

	public String toString() {
		   return nome
		      + ", $"
		      + String.format("%.2f", preco)
		      + ", "
		      + quantidade
		      + " unidades, Total: $ "
		      + valortotalestoque();
    }
	
}
