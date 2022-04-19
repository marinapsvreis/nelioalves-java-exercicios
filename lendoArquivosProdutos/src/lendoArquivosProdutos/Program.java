package lendoArquivosProdutos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Program {

	public static void main(String[] args) {

		String path = "c:\\temp\\listaprodutos.csv";
		String produtos = "";
		String[] nomeProdutos = new String[4];
		String[] precoProdutos = new String[4];
		String[] quantidadeProdutos = new String[4];
		double[] somaProdutos = new double[4];
		String[] somaProdutosStr = new String[4];
		int i = 0;
		int j = 0;

		// le cada linha do lista produtos
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();

			while (line != null && i < 4) {
				produtos += line + ",";
				i++;
				line = br.readLine();
			}

			//separando os valores por virgula
			String[] produtosSeparados = produtos.split(",");
			
			//separando os valores por tipos de vetores ainda com tipagem errada
			for(i = 0; i < produtosSeparados.length/3; i++) {
				nomeProdutos[i] = produtosSeparados[j];
				precoProdutos[i] = produtosSeparados[j+1];
				quantidadeProdutos[i] = produtosSeparados[j+2];
				
				j+=3;
						
			}
			
			//corrigir tipagem e realizar multiplicacao
			for(i = 0; i < nomeProdutos.length; i++) {
				somaProdutos[i] = Double.parseDouble(precoProdutos[i]) * Double.parseDouble(quantidadeProdutos[i]);
				somaProdutosStr[i] = Double.toString(somaProdutos[i]);
			}
			

		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		
		//escreve cada linha do summary
		
		File strPath = new File("c:\\temp");
		boolean success = new File(strPath + "\\out").mkdir();
		String path2 = "c:\\temp\\out\\summary.csv";
		String[] resultadoPedidos = new String[4];
		
		for(i = 0; i < nomeProdutos.length; i++) {
			resultadoPedidos[i] = nomeProdutos[i] + ", " + somaProdutos[i];
		}
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path2))) {		
			for(String resultado : resultadoPedidos) {
				bw.write(resultado);
				bw.newLine();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
