package io.github.jvgontijo.curso;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestaListaOrdenaCursos {
	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("Java 8", 150));
		cursos.add(new Curso("JavaScript", 113));
		cursos.add(new Curso("C", 55));
		
//		cursos.sort(Comparator.comparing(Curso::getAlunos));
//		cursos.forEach(c -> System.out.println(c.getNome()));
		
//		cursos.stream()
//			.filter(c -> c.getAlunos() > 50)
//			.forEach(c -> System.out.println(c.getNome()));
		
//		Optional<Curso> primeiroCursoEncontrado = cursos.stream()
//		.filter(c -> c.getAlunos() > 50)
//		.findFirst();
//		primeiroCursoEncontrado.ifPresent(c -> System.out.println(c.getNome()));
		
//		OptionalDouble mediaDosAlunos = cursos.stream().mapToInt(Curso::getAlunos).average();
//		System.out.println(mediaDosAlunos);
		
//		cursos.stream()
//			.map(Curso::getNome)
//			.forEach(System.out::println);
		
		
		List<Curso> list = cursos.stream()
				.filter(c -> c.getAlunos() > 50)
				.collect(Collectors.toList());
		System.out.println(list);
	}
}
