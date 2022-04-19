package escrevendoEmArquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		String[] produtos = new String[4];
		
		String path = "c:\\temp\\out.txt";
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			for(String produto : produtos) {
				bw.write(produto);
				bw.newLine();
			}
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
