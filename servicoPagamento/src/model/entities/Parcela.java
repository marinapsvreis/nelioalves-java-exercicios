package model.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Parcela {
	private Contrato contrato;
	private LocalDate dataVencimento;
	private Double valor;
	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public Parcela(Contrato contrato, LocalDate dataVencimento, Double valor) {
		this.contrato = contrato;
		this.dataVencimento = dataVencimento;
		this.valor = valor;
	}

	public Contrato getContrato() {
		return contrato;
	}

	public LocalDate getDataVencimento() {
		return dataVencimento;
	}

	public Double getValor() {
		return valor;
	}

	public void setDataVencimento(LocalDate dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
	
	public String toString() {
		return dataVencimento.format(formatter) + " - " + valor;
	}

}
