package principal;

import java.util.Locale;
import java.util.Scanner;

import entidade.Produto;

public class Programa {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Produto product = new Produto();
		System.out.println("digite informação do produto: ");
		System.out.println("nome: ");
		product.nome = sc.nextLine();
		System.out.println("preço: ");
		product.preco = sc.nextDouble();
		System.out.println("quantidade: ");
		product.quantidade = sc.nextInt();
        
		System.out.println(product.toString());

		System.out.println();
		System.out.println("número de produtos para serem adicionados: ");
		int quantidade = sc.nextInt();
		product.addprodutos(quantidade);

		System.out.println();
		System.out.println("quantidade atualizada : " + product);

		System.out.println();
		System.out.println("número de produtos para serem removidos: ");
		quantidade = sc.nextInt();
		product.removerquantidade(quantidade);

		System.out.println();
		System.out.println("quantidade atualizada : " + product);
		
		sc.close();

	}

}
