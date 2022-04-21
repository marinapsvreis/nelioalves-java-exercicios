package entities;

import java.util.HashSet;
import java.util.Set;

public class Curso {
	private String nomeCurso;
	private Set<Aluno> listaAlunos = new HashSet<>();
	private Instrutor instrutor;

	public Curso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public String getNomeCurso() {
		return nomeCurso;
	}

	public Set<Aluno> getListaAlunos() {
		return listaAlunos;
	}

	public Instrutor getInstrutor() {
		return instrutor;
	}

	public void setInstrutor(Instrutor instrutor) {
		this.instrutor = instrutor;
		getInstrutor().addCurso(this);
	}
	
	public void removeInstrutor() {
		this.instrutor = null;
		getInstrutor().removeCurso(this);
	}

	public void addAluno(Aluno aluno) {
		listaAlunos.add(aluno);
		getInstrutor().addAluno(aluno);
	}

	public void removeAluno(Aluno aluno) {
		listaAlunos.remove(aluno);
		getInstrutor().removeAluno(aluno);
	}

}
