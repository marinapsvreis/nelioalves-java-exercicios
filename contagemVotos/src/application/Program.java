package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> listaVotos = new HashMap<>();

		System.out.println("Digite o caminho do arquivo");
		String path = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				if (listaVotos.containsKey(fields[0])) {
					listaVotos.put(fields[0], (listaVotos.get(fields[0]) + Integer.parseInt(fields[1])));
				} else {
					listaVotos.put(fields[0], Integer.parseInt(fields[1]));
				}

				line = br.readLine();
			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		System.out.println();
		for (String candidato : listaVotos.keySet()) {
			System.out.println(candidato + ": " + listaVotos.get(candidato));
		}

		sc.close();

	}

}
