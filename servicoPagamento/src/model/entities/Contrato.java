package model.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import model.services.MetodoPagamento;

public class Contrato {
	private Integer numero;
	private LocalDate data;
	private Double valorTotal;
	private MetodoPagamento metodoPagamento;
	public List<Parcela> listaParcelas = new ArrayList<>();

	public Contrato(Integer numero, LocalDate data, Double valorTotal, MetodoPagamento metodoPagamento) {
		this.numero = numero;
		this.data = data;
		this.valorTotal = valorTotal;
		this.metodoPagamento = metodoPagamento;
	}

	public Integer getNumero() {
		return numero;
	}

	public LocalDate getData() {
		return data;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public MetodoPagamento getMetodoPagamento() {
		return metodoPagamento;
	}

	public void addParcela(Parcela parcela) {
		listaParcelas.add(parcela);
	}

	public void removeParcela(Parcela parcela) {
		listaParcelas.remove(parcela);
	}

	public void mostrarParcelas() {
		for (Parcela parcela : listaParcelas) {
			System.out.println(parcela);
		}
	}

}
