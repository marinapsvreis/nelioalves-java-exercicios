package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int numerosNegativos = 0;
		int[] vetorDiagonalPrincipal = new int[n];

		int[][] matriz = new int[n][n];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
				if (matriz[i][j] < 0) {
					numerosNegativos++;
				}
			}
			System.out.println();
		}

		

		for (int i = 0; i < vetorDiagonalPrincipal.length; i++) {
			vetorDiagonalPrincipal[i] = matriz[i][i];
		}

		System.out.print("Diagonal Principal: ");

		for (int i = 0; i < n; i++) {
			System.out.print(vetorDiagonalPrincipal[i] + " ");
		}

		System.out.println();
		System.out.println("Quantidade números negativos: " + numerosNegativos);

		sc.close();
	}

}
