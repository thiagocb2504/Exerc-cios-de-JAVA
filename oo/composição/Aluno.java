package oo.composição;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

	final String nome;
	final List<Curso> cursos = new ArrayList<>();

	Aluno(String nome) {
		this.nome = nome;
	}

	void adicionarCurso(Curso curso) {
		this.cursos.add(curso);
		curso.alunos.add(this);
	}

	Curso obterCursoPorNome(String nome) { // Método criado para procurar dentro do 
		//aluno um cruso com o nome passado
		for (Curso curso : this.cursos) {
			if (curso.nome.equalsIgnoreCase(nome)) {
				return curso;

			}
		}
		return null;
	}

	public String toString() { // Método usado pra converter objeto em formato String
		return nome; // Pode colocar nome, frase e etc.
	}
}
