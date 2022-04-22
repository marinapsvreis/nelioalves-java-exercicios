package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter full file path: ");
		String path = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			List<Funcionario> list = new ArrayList<>();

			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Funcionario(fields[0], fields[1], Double.parseDouble(fields[2])));
				line = br.readLine();
			}

			System.out.print("Acima de qual valor de salário você deseja filtrar os e-mails? ");
			Double valorSalario = sc.nextDouble();

			Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

			List<String> emails = list.stream().filter(f -> f.getSalario() > valorSalario).map(p -> p.getEmail())
					.sorted(comp).collect(Collectors.toList());

			System.out.println();
			System.out.println(
					"Email das pessoas que tem o salario maior que " + String.format("%.2f", valorSalario) + ": ");

			emails.forEach(System.out::println);

			double sum = list.stream().filter(f -> f.getNome().charAt(0) == 'M').map(f -> f.getSalario()).reduce(0.0,
					(x, y) -> x + y);

			System.out.println("Soma do salário dos funcionarios que começam com a letra M: " + String.format("%.2f", sum));

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		sc.close();

	}

}
