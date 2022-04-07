package util;

public class CurrencyConverter {
	public static double cotacao;
	public static double qtdCompra;
	
	public static double custoDeCompra() {
		return cotacao * qtdCompra * 1.06;
	}
}
