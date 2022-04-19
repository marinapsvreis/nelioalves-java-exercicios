package lendoArquivosProdutos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {

		String path = "c:\\temp\\listaprodutos.csv";
		List<PedidoItem> listaItens = new ArrayList<>();

		// le cada linha do lista produtos e constroi um objeto
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();

			while (line != null) {
				// separando os valores por virgula
				String[] linhaPedidos = line.split(",");
				listaItens.add(new PedidoItem(linhaPedidos[0], Double.parseDouble(linhaPedidos[1]),
						Integer.parseInt(linhaPedidos[2])));
				line = br.readLine();
			}

			// realizar multiplicacao por cada linha
			for (PedidoItem linha : listaItens) {
				linha.setPedidoTotalPorItem(linha.getPreco() * linha.getQuantidade());
			}

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		// escreve cada linha do summary

		File strPath = new File("c:\\temp");
		boolean success = new File(strPath + "\\out").mkdir();
		String path2 = "c:\\temp\\out\\summary.csv";
		

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path2))) {
			
			for(PedidoItem resultado : listaItens) {
				bw.write(resultado.getNome() + ", " + resultado.getPedidoTotalPorItem());
				bw.newLine();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
