package entities;

public class Aluno {
	public String nome;
	public double nota1, nota2, nota3, notaFinal;
	
	public double calcNotaFinal() {
		this.notaFinal = nota1+nota2+nota3;
		return notaFinal;
	}
	
	public String resultado() {
		if(notaFinal >= 60.00) {
			return "Passou!";
		}else {
			double faltou = (60.00 - notaFinal);
			return "Reprovou!\nFaltou " + faltou + " pontos." ;
		}
	}
}
