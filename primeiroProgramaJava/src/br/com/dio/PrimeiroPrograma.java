package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		Gato gato = new Gato("Joao", "Preto", 26);
		Livros livros = new Livros();
		
		
		System.out.println(gato);
		
		/*int a = 2;
		int b = 4;
		
		System.out.println("Hello World" + " " + (a+b));*/
	}
}


class Livros {
	private String nome;
	private String npag;
}