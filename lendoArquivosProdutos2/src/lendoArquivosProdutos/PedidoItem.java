package lendoArquivosProdutos;

public class PedidoItem {
	private String nome;
	private double preco;
	private int quantidade;
	private double pedidoTotalPorItem;
	// private static double pedidoTotal;

	public PedidoItem(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public double getPedidoTotalPorItem() {
		return pedidoTotalPorItem;
	}

	public void setPedidoTotalPorItem(double pedidoTotalPorItem) {
		this.pedidoTotalPorItem = pedidoTotalPorItem;
	}

}
