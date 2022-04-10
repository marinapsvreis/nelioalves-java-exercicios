package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Quarto;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numeroQuartos = 10;
		
		Quarto[] vetorQuartos = new Quarto[numeroQuartos];

		for(int i = 0; i < numeroQuartos; i++) {
			vetorQuartos[i] = null;
		}
		
		System.out.print("Quantos quartos serão alugados? ");
		int quartosAlugados = sc.nextInt();
		
		
		for(int i = 0; i < quartosAlugados; i++) {
			System.out.printf("Aluguel #%d:\n", (i+1));
			sc.nextLine();
			System.out.print("Name: ");
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Número do Quarto: ");
			int numeroQuarto = sc.nextInt();
			
			vetorQuartos[numeroQuarto] = new Quarto(nome, email, numeroQuarto);
		}
		
		System.out.println("\nQuartos Ocupados:\n ");
		
		for(int i = 0; i < numeroQuartos; i++) {
			if(vetorQuartos[i] != null) {
				System.out.printf("%d: %s, %s%n", 
						vetorQuartos[i].getNumeroQuarto(), 
						vetorQuartos[i].getNomeHospede(), 
						vetorQuartos[i].getEmailHospede());
			}
		}		
		
		sc.close();

	}

}
