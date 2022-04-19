package model.services;

import java.time.LocalDate;
import java.util.Scanner;

import model.entities.Contrato;
import model.entities.Parcela;

public class Paypal implements MetodoPagamento {
	
	Scanner sc = new Scanner(System.in);

	@Override
	public void calculoParcelas(Contrato contrato) {
		System.out.print("Digite em quantas parcelas você deseja pagar os " + String.format("%.2f", contrato.getValorTotal()) + ": ");
		int parcelas = sc.nextInt();
		double valorPorParcela = contrato.getValorTotal()/parcelas;		
		int month = 1;
		
		while(month <= parcelas) {
			LocalDate dataVencimento = contrato.getData().plusMonths(month);
			Parcela p = new Parcela(contrato, dataVencimento, (valorPorParcela+(month*valorPorParcela*0.01))*1.02);
			month++;			
			contrato.addParcela(p);	
		}
		
		sc.close();		
	}	
	
}
