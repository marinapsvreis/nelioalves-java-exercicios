package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos empregados serão registrados? ");
		int qtdRegistros = sc.nextInt();

		List<Funcionario> list = new ArrayList<>();

		for (int i = 1; i <= qtdRegistros; i++) {
			System.out.printf("Funcionario #%d:%n", i);
			System.out.print("Id: ");
			int id = sc.nextInt();
			while (temId(list, id)) {
				System.out.print("Id already taken. Try again: ");
				id = sc.nextInt();
			}
			sc.nextLine();
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Salario: ");
			double salario = sc.nextDouble();
			System.out.println();
			
			list.add(new Funcionario(id, nome, salario));
		}

		System.out.print("Escolha o id do funcionário que vai receber aumento: ");
		int idAumento = sc.nextInt();
				
		Funcionario func = list.stream().filter(x -> x.getId() == idAumento).findFirst().orElse(null);
				
		if(func == null) {
			System.out.println("Esse id não existe!");
		}else {
			System.out.print("Escolha a porcentagem do aumento: ");
			double percentage = sc.nextInt();
			func.aumentarSalario(percentage);
		}
		
		System.out.println();
		
		System.out.println("Lista de Funcionários:");
		for(Funcionario obj : list) {
			System.out.println(obj);
		}

		sc.close();
		
	}
	
	public static boolean temId(List<Funcionario> list, int id) {
		Funcionario func = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return func != null;
	}

}
