package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Funcionario;
import entities.FuncionarioTerceirizado;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número de funcionarios que deseja armazenar: ");
		int quantidadeFuncionarios = sc.nextInt();
		
		List<Funcionario> listaFuncionarios = new ArrayList<>();
		
		for(int i = 1; i <= quantidadeFuncionarios; i++) {
			System.out.printf("Funcionario #%d dados:%n", i);
			System.out.print("Terceirizado? (S/N)");
			char terceirizado = sc.next().charAt(0);
			sc.nextLine();
			if(terceirizado == 's' || terceirizado == 'S') {
				System.out.print("Nome: ");
				String nome = sc.nextLine();
				System.out.print("Horas: ");
				int horas = sc.nextInt();
				System.out.print("Valor Hora: ");
				double valorHora = sc.nextDouble();
				System.out.print("Despesa adicional: ");
				double despesaAdicional = sc.nextDouble();
				sc.nextLine();
				
				listaFuncionarios.add(new FuncionarioTerceirizado(nome, horas, valorHora, despesaAdicional));
			}else {
				System.out.print("Nome: ");
				String nome = sc.nextLine();
				System.out.print("Horas: ");
				int horas = sc.nextInt();
				System.out.print("Valor Hora: ");
				double valorHora = sc.nextDouble();
				
				listaFuncionarios.add(new Funcionario(nome, horas, valorHora));
			}
		}
		
		System.out.println("\nPAGAMENTOS:");
		
		for(Funcionario i : listaFuncionarios) {
			System.out.println(i);
		}
		
		sc.close();

	}

}
