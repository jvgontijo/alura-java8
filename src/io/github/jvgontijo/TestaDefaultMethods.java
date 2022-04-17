package io.github.jvgontijo;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class TestaDefaultMethods {
	public static void main(String[] args) {
		
		List<String> palavras = new ArrayList<String>();
		palavras.add("caçamba");
		palavras.add("canva");
		palavras.add("computacional");
		
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
