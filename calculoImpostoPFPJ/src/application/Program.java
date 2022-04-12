package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Pessoa> listaPessoas = new ArrayList<>();

		System.out.println("Digite o número de pessoas para calcular taxas: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.printf("Pessoa #%d dados: %n", i);
			System.out.print("Pessoa Fisica ou Pessoa Juridica (f/j)?");
			char tipo = sc.next().charAt(0);
			sc.nextLine();
			
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Renda anual: ");
			double rendaAnual = sc.nextDouble();
			
			if(tipo == 'f' || tipo == 'F') {
				System.out.print("Gastos com saude: ");
				double gastosSaude = sc.nextDouble();
				
				listaPessoas.add(new PessoaFisica(nome, rendaAnual, gastosSaude));
				
			}else {
				System.out.print("Número de funcionários: ");
				int numeroFuncionarios = sc.nextInt();
				
				listaPessoas.add(new PessoaJuridica(nome, rendaAnual, numeroFuncionarios));
			}

		}
		
		double somaImpostos = 0.0;
		
		System.out.println();
		System.out.println("Taxas por pessoa: ");
		for(Pessoa p : listaPessoas) {
			somaImpostos += p.calcImposto();
			System.out.println(p.getNome() + ": R$" + String.format("%.2f", p.calcImposto()));
		}
		System.out.println();
		System.out.println("TOTAL IMPOSTOS: " +  somaImpostos);

		sc.close();
	}

}
