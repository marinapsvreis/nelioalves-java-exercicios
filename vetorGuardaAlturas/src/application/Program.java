package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		double[] vetor = new double[n];
		double somaAlturas = 0.0;
		
		for(int i = 0; i < n; i++) {
			vetor[i] = sc.nextDouble();
			somaAlturas += vetor[i];
		}
		
		double mediaAltura = somaAlturas/n;
		
		System.out.println("Média alturas: " + mediaAltura);		
		
		sc.close();

	}

}
