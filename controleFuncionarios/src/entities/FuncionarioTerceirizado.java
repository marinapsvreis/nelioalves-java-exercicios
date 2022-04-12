package entities;

public class FuncionarioTerceirizado extends Funcionario {
	private double despesaAdicional;

	public FuncionarioTerceirizado() {
		super();
	}

	public FuncionarioTerceirizado(String nome, Integer horas, Double valorHora, double despesaAdicional) {
		super(nome, horas, valorHora);
		this.despesaAdicional = despesaAdicional;
	}

	public double getDespesaAdicional() {
		return despesaAdicional;
	}

	public void setDespesaAdicional(double despesaAdicional) {
		this.despesaAdicional = despesaAdicional;
	}
	
	@Override
	public final double pagamento() {
		return super.pagamento() + despesaAdicional*1.1;
	}

}
