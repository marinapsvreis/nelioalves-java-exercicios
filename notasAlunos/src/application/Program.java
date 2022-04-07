package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Aluno;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.println("Digite o nome do aluno: ");
		aluno.nome = sc.nextLine();
		System.out.println("Digite a nota do primeiro trimestre: ");
		aluno.nota1 = sc.nextDouble();
		System.out.println("Digite a nota do segundo trimestre: ");
		aluno.nota2 = sc.nextDouble();
		System.out.println("Digite a nota do terceiro trimestre: ");
		aluno.nota3 = sc.nextDouble();
		
		System.out.println("Nota Final: " + aluno.calcNotaFinal());
		System.out.println(aluno.resultado());
		
		
		sc.close();

	}

}
