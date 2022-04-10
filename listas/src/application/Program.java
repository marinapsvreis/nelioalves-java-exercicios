package application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {

		// instanciando a lista usando ArrayList
		List<String> list = new ArrayList<>();

		// adicionando elementos na lista
		list.add("Marina");
		list.add("Douglas");
		list.add("Enaide");
		list.add("Mateus");
		list.add("Augusto");

		// adicionando em posição especifica
		list.add(2, "Fury");

		// como saber o tamanho da lista
		System.out.println("Tamanho lista: " + list.size());

		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("-------------------------------");

		// removendo item da lista
		list.remove("Augusto");
		list.remove(4);
		list.removeIf(x -> x.charAt(0) == 'E');
		
		for (String x : list) {
			System.out.println(x);
		}
		
		System.out.println("-------------------------------");
		
		//procurando o indice de um que existe e outro que não existe
		System.out.println("Index Fury: " + list.indexOf("Fury"));
		System.out.println("Index Enio: " + list.indexOf("Enio")); //aparece -1 quando não existe
		
		System.out.println("-------------------------------");
		
		//filtrar lista com nomes que começa com M
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());
		
		for (String x : result) {
			System.out.println(x);
		}
		
		System.out.println("-------------------------------");
		
		//encontrar o primeiro elemento que atenda um predicado
		
		String nome = list.stream().filter(x -> x.charAt(0) == 'F').findFirst().orElse(null);
		
		System.out.println(nome);
	}

}
