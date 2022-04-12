package entities;

public class PessoaFisica extends Pessoa {

	private double gastosSaude;

	public PessoaFisica() {
		super();
	}

	public PessoaFisica(String nome, Double rendaAnual, double gastosSaude) {
		super(nome, rendaAnual);
		this.gastosSaude = gastosSaude;
	}

	public double getGastosSaude() {
		return gastosSaude;
	}

	public void setGastosSaude(double gastosSaude) {
		this.gastosSaude = gastosSaude;
	}

	@Override
	public double calcImposto() {
		if(rendaAnual < 20000.00) {
			return rendaAnual*0.15;
		}else {
			return rendaAnual*0.25 - gastosSaude*0.5;
		}
	}

}
