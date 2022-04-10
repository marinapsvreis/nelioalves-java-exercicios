package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produto;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		Produto[] vetorProdutos = new Produto[n];
		double somaPrecos = 0.0;

		for (int i = 0; i < vetorProdutos.length; i++) {
			sc.nextLine();
			String nome = sc.nextLine();
			double preco = sc.nextDouble();
			vetorProdutos[i] = new Produto(nome, preco);
			somaPrecos += vetorProdutos[i].getPreco();
		}

		double mediaPrecos = somaPrecos / n;

		System.out.printf("Média preços: R$ %.2f%n", mediaPrecos);

		sc.close();

	}

}