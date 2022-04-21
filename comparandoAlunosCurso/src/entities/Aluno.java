package entities;

import java.util.Objects;

public class Aluno {
	private int id;
	private String nomeAluno;

	public Aluno(int id, String nomeAluno) {
		this.id = id;
		this.nomeAluno = nomeAluno;
	}

	public int getId() {
		return id;
	}

	public String getNomeAluno() {
		return nomeAluno;
	}

	@Override
	public String toString() {
		return id + " - " + nomeAluno;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return id == other.id;
	}

}
