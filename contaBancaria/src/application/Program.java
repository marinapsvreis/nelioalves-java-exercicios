package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		int numeroConta = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String nomeTitular = sc.nextLine();		
		System.out.print("Is there an initial deposit? (y/n)");
		String option = sc.nextLine();
		
		double depositoInicial = 0.0;
		
		if(option.equals("y")) {
			System.out.print("Enter inicial deposit value: ");
			depositoInicial = sc.nextDouble();
		}
		
		System.out.print("\n");
		
		Conta conta = new Conta(numeroConta, nomeTitular, depositoInicial);
		
		System.out.println("Account data:\n" + conta.toString());
		
		System.out.print("Enter a deposit value: ");
		conta.deposito(sc.nextDouble());
		System.out.println("Updated account data:\n" + conta.toString());
		
		System.out.print("Enter a withdraw value: ");
		conta.saque(sc.nextDouble());
		System.out.println("Updated account data:\n" + conta.toString());
		
		
		sc.close();

	}

}
