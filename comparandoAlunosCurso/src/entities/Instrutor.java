package entities;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Instrutor {
	private String nome;
	private List<Curso> listaCursos = new ArrayList<>();
	private Set<Aluno> listaAlunosPorInstrutor = new HashSet<>();

	public Instrutor(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public List<Curso> getListaCursos() {
		return listaCursos;
	}

	public Set<Aluno> getListaAlunosPorInstrutor() {
		return listaAlunosPorInstrutor;
	}
	
	public void addCurso(Curso curso) {
		listaCursos.add(curso);
	}
	
	public void removeCurso(Curso curso) {
		listaCursos.remove(curso);
	}
	
	public void addAluno(Aluno aluno) {
		listaAlunosPorInstrutor.add(aluno);
	}
	
	public void removeAluno(Aluno aluno) {
		listaAlunosPorInstrutor.remove(aluno);
	}

}
