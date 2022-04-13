package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			// varios dados na mesma linha , cada espa�o um item do vetor
			String[] vetor = sc.nextLine().split(" ");

			System.out.println("Digite a posi��o do vetor que voc� quer ler: ");
			int posicao = sc.nextInt();

			System.out.println(vetor[posicao]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Posi��o inv�lida!");
		} catch (InputMismatchException e) {
			System.out.println("Erro de digita��o!");
		}

		System.out.println("Fim do programa!");

		sc.close();

	}

}
