package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contrato;
import model.entities.Parcela;
import model.services.Paypal;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Entre com os dados do contrato: ");
		System.out.print("Numero: ");
		int numero = sc.nextInt();
		sc.nextLine();
		System.out.print("Data (dd/MM/yyyy): ");
		String data = sc.nextLine();
		System.out.print("Valor do Contrato: ");
		double valor = sc.nextDouble();
		
		LocalDate dataFormatada = LocalDate.parse(data, formatter);
				
		Contrato c1 = new Contrato(numero, dataFormatada, valor, new Paypal());
		
		c1.getMetodoPagamento().calculoParcelas(c1);
		
		System.out.println("Parcelas: ");
		c1.mostrarParcelas();
		                          
		
		sc.close();

	}

}
