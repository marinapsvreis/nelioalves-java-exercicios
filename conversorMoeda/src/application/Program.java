package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a cota��o da moeda que voc� quer comprar: ");
		CurrencyConverter.cotacao = sc.nextDouble();
		System.out.print("Digite quanto voc� quer comprar: ");
		CurrencyConverter.qtdCompra = sc.nextDouble();
		
		System.out.println("Valor a ser pago em reais = " 
				+ String.format("%.2f", CurrencyConverter.custoDeCompra()));
		
		sc.close();
	}

}
