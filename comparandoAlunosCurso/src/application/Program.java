package application;

import entities.Aluno;
import entities.Curso;
import entities.Instrutor;

public class Program {

	public static void main(String[] args) {

		Instrutor i1 = new Instrutor("Alex");
		Curso a = new Curso("A");
		Curso b = new Curso("B");
		Curso c = new Curso("C");
		a.setInstrutor(i1);
		b.setInstrutor(i1);
		c.setInstrutor(i1);
		Aluno a1 = new Aluno(1, "Marina");
		Aluno a2 = new Aluno(2, "Bob");
		Aluno a3 = new Aluno(3, "Ucah");
		Aluno a4 = new Aluno(4, "Hawk");
		Aluno a5 = new Aluno(5, "Dark");
		Aluno a6 = new Aluno(6, "Corvo");
		a.addAluno(a1);
		a.addAluno(a2);
		a.addAluno(a3);
		b.addAluno(a1);
		b.addAluno(a3);
		b.addAluno(a5);
		c.addAluno(a2);
		c.addAluno(a4);
		c.addAluno(a6);
		
		System.out.println("Alunos curso A:");
		System.out.println(a.getListaAlunos());
		System.out.println("Alunos curso B:");
		System.out.println(b.getListaAlunos());
		System.out.println("Alunos curso C:");
		System.out.println(c.getListaAlunos());
		
		System.out.println("Alunos do instrutor Alex:");
		System.out.println(i1.getListaAlunosPorInstrutor());
		System.out.println("Total de alunos: " + i1.getListaAlunosPorInstrutor().size());
		

	}

}
