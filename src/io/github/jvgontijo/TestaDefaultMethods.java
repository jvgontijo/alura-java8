package io.github.jvgontijo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class TestaDefaultMethods {
	public static void main(String[] args) {
		
		List<String> palavras = new ArrayList<String>();
		palavras.add("é a maior");
		palavras.add("string");
		palavras.add("essa");
		
		palavras.sort(new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				if(s1.length() > s2.length()) {
					return 1;
				}
				if(s1.length() < s2.length()) {
					return -1;
				}
				return 0;
			}
		});
		
		Consumer<String> consumidor = new ImprimePalavras();
		palavras.forEach(consumidor);
	}
}

class ImprimePalavras implements Consumer<String>{

	@Override
	public void accept(String s) {
		System.out.println(s);
	}
	
}
