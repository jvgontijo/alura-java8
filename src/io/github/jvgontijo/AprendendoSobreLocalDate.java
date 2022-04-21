package io.github.jvgontijo;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class AprendendoSobreLocalDate {
	public static void main(String[] args) {
		
		LocalDate dataAtual = LocalDate.now();
		System.out.println(dataAtual);
		
		LocalDate futuro = LocalDate.of(2099, 1, 25);
		//LocalDate futuro = LocalDate.of(2099, Month.JANUARY, 25);
		System.out.println(futuro);
		
		Period periodo = Period.between(dataAtual, futuro);
		System.out.println("A diferença entre as datas é: " + 
				periodo.getYears() + " anos, " 
				+ periodo.getMonths() + " meses e " 
				+ periodo.getDays() + " dias");
		
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate novaData = LocalDate.now();
		String dataFormatada = novaData.format(formatador);
		System.out.println(dataFormatada);
	}
}
