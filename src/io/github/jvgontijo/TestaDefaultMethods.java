package io.github.jvgontijo;

import java.util.ArrayList;
import java.util.List;

public class TestaDefaultMethods {
	public static void main(String[] args) {

		List<String> palavras = new ArrayList<String>();
		palavras.add("é a maior");
		palavras.add("string");
		palavras.add("essa");

		palavras.sort((String s1, String s2) -> Integer.compare(s1.length(), s2.length()));

		palavras.forEach(s -> System.out.println(s));
		
	}
}