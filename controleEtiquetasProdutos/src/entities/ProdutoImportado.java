package entities;

public class ProdutoImportado extends Produto  {
	private Double taxasCustomizadas;

	public ProdutoImportado(String nome, Double preco, Double taxasCustomizadas) {
		super(nome, preco);
		this.taxasCustomizadas = taxasCustomizadas;
	}

	public Double getTaxasCustomizadas() {
		return taxasCustomizadas;
	}

	public void setTaxasCustomizadas(Double taxasCustomizadas) {
		this.taxasCustomizadas = taxasCustomizadas;
	}
	
	@Override
	public String priceTag() {
		return getNome() 
				+ " R$ "
				+ String.format("%.2f", getPreco())
				+ " (Taxa da Alfandega: "
				+ String.format("%.2f", taxasCustomizadas)
				+ ")";
	}

}
