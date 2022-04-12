package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.Produto;
import entities.ProdutoImportado;
import entities.ProdutoUsado;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		List<Produto> list = new ArrayList<>();

		System.out.print("Digite o numero de produtos: ");
		int numeroProdutos = sc.nextInt();

		for (int i = 1; i <= numeroProdutos; i++) {
			System.out.printf("Produto #%d dados:%n", i);
			System.out.println("Comum, usado ou importado? (c/u/i)");
			char tipo = sc.next().charAt(0);

			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Preço: ");
			double preco = sc.nextDouble();

			if (tipo == 'u' || tipo == 'U') {
				System.out.print("Data de fabricação (DD/MM/YYYY): ");
				Date data = sdf.parse(sc.next());

				list.add(new ProdutoUsado(nome, preco, data));

			} else if (tipo == 'i' || tipo == 'I') {

				System.out.print("Taxa da Alfandega: ");
				double taxaCustomizada = sc.nextDouble();

				list.add(new ProdutoImportado(nome, preco, taxaCustomizada));

			} else {

				list.add(new Produto(nome, preco));

			}

		}

		System.out.println();
		System.out.println("PRICE TAGS:");
		for (Produto prod : list) {
			System.out.println(prod.priceTag());
		}
		
		sc.close();

	}

}
