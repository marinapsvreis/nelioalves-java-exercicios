package entities;

public class Funcionario {
	private String nome;
	private Integer horas;
	private Double valorHora;

	public Funcionario() {

	}

	public Funcionario(String nome, Integer horas, Double valorHora) {
		this.nome = nome;
		this.horas = horas;
		this.valorHora = valorHora;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getHoras() {
		return horas;
	}

	public void setHoras(Integer horas) {
		this.horas = horas;
	}

	public Double getValorHoras() {
		return valorHora;
	}

	public void setValorHoras(Double valorHoras) {
		this.valorHora = valorHoras;
	}
	
	public double pagamento() {
		return horas*valorHora;
	}
	
	@Override
	public String toString() {
		return nome + " - R$ " + String.format("%.2f", pagamento());
	}

}
