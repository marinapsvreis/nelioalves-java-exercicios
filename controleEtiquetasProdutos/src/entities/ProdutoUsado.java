package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto {
	private Date dataFabricacao;

	public ProdutoUsado(String nome, Double preco, Date dataFabricacao) {
		super(nome, preco);
		this.dataFabricacao = dataFabricacao;
	}

	public Date getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(Date dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}
	
	@Override
	public String priceTag() {
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
		
		return  getNome() 
				+ "(used) R$ "
				+ String.format("%.2f", getPreco())
				+ " (Data de fabricação: "
				+ sdf1.format(dataFabricacao)
				+ ")";
	}

}
