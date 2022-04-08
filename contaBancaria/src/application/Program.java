package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta;
		
		System.out.print("Enter account number: ");
		int numeroConta = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String nomeTitular = sc.nextLine();		
		System.out.print("Is there an initial deposit? (y/n)");
		String option = sc.next();		
		
		if(option.equals("y")) {
			System.out.print("Enter inicial deposit value: ");
			double depositoInicial = sc.nextDouble();
			conta = new Conta(numeroConta, nomeTitular, depositoInicial);
		}else {
			conta = new Conta(numeroConta, nomeTitular);
		}
		
		System.out.print("\n");
		
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
