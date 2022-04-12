package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circulo;
import entities.Forma;
import entities.Retangulo;
import entities.enums.Cor;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		List<Forma> listaFormas = new ArrayList<>();

		System.out.print("Digite o numero de formas: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.printf("Forma #%d dados:%n", i);
			System.out.print("Retangulo/Circulo (r/c)?");
			char tipo = sc.next().charAt(0);
			System.out.print("Cor (BLACK/BLUE/RED):");
			Cor cor = Cor.valueOf(sc.next());

			if (tipo == 'r' || tipo == 'R') {
				System.out.print("Digite a largura: ");
				double largura = sc.nextDouble();
				System.out.print("Digite a altura: ");
				double altura = sc.nextDouble();

				listaFormas.add(new Retangulo(cor, largura, altura));

			} else {
				System.out.print("Digite o raio: ");
				double raio = sc.nextDouble();

				listaFormas.add(new Circulo(cor, raio));
			}
		}
		
		System.out.println();
		System.out.println("Áreas das formas: ");
		for(Forma f : listaFormas ) {
			System.out.println(String.format("%.2f", f.area()));
		}

		sc.close();

	}

}
