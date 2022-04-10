package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
			System.out.print("Digite o maior n�mero: ");
			int n = sc.nextInt();
			
			int[] vetorPares;
			int[] vetorImpares;
			
			int par = 0, imp = 0;
			
			vetorPares = new int[n/2 + 1];
			
			if(n%2 == 0) {
				vetorImpares = new int[n/2];				
			}else {
				vetorImpares = new int[n/2 + 1];
			}
			
			for(int i = 0; i <= n; i++) {
				if(i%2 == 0) {
					vetorPares[par] = i;
					par++;
				}else {
					vetorImpares[imp] = i;
					imp++;
				}
			}
			
			System.out.print("N�meros Pares: ");
			for(int i = 0; i < vetorPares.length; i++) {
				System.out.print(vetorPares[i]);
				if(i<vetorPares.length - 1) {
					System.out.print(", ");
				}
			}
			
			System.out.println();
			
			System.out.print("N�meros Impares: ");
			for(int i = 0; i < vetorImpares.length; i++) {
				System.out.print(vetorImpares[i]);
				if(i<vetorImpares.length - 1) {
					System.out.print(", ");
				}				
			}			
		
		sc.close();

	}

}
