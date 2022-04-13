package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		method1();

		System.out.println("Fim do programa!");

	}
	
	public static void method1() {
		System.out.println("***METHOD1START ****");
		method2();
		System.out.println("***METHOD1END ****");
	}
	

	public static void method2() {
		
		System.out.println("***METHOD2START ****");
		Scanner sc = new Scanner(System.in);

		try {
			// varios dados na mesma linha , cada espaço um item do vetor
			String[] vetor = sc.nextLine().split(" ");

			System.out.println("Digite a posição do vetor que você quer ler: ");
			int posicao = sc.nextInt();

			System.out.println(vetor[posicao]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Posição inválida!");
			e.printStackTrace();
			sc.next();
		} catch (InputMismatchException e) {
			System.out.println("Erro de digitação!");
		}

		sc.close();
		
		System.out.println("***METHOD2END ****");
	}

}
