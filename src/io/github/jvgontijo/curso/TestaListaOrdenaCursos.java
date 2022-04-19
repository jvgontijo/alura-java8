package io.github.jvgontijo.curso;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestaListaOrdenaCursos {
	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("Java 8", 150));
		cursos.add(new Curso("JavaScript", 113));
		cursos.add(new Curso("C", 55));
		
		cursos.sort(Comparator.comparing(Curso::getAlunos));
		cursos.forEach(c -> System.out.println(c.getNome()));
	}
}
