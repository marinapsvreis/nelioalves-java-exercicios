package model.services;

import model.entities.Contrato;

public interface MetodoPagamento {
	public void calculoParcelas(Contrato contrato);
}
