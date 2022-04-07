package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Funcionario funcionario = new Funcionario();
		
		System.out.print("Escreva o nome do funcionário: ");
		funcionario.name = sc.nextLine();
		System.out.print("Escreva o salario bruto do " + funcionario.name + ": ");
		funcionario.grossSalary = sc.nextDouble();
		System.out.print("Escreva o imposto sobre o salario do " + funcionario.name + ": ");
		funcionario.tax = sc.nextDouble();
		
		System.out.println("Funcionário: " + funcionario);
		
		System.out.print("Quantos % você deseja aumentar o salario? ");
		int percentage = sc.nextInt();
		funcionario.increaseSalary(percentage);
		System.out.println("Dados atualizados: " + funcionario);
		
		sc.close();
		

	}

}
