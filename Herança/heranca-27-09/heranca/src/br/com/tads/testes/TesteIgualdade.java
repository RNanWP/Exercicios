package br.com.tads.testes;

import br.com.tads.modelo.Funcionario;

public class TesteIgualdade {

	public static void main(String[] args) {
		
		Funcionario func1 = new Funcionario(1010,"Maria",3000);
		Funcionario func2 = new Funcionario(1010,"Maria",3000);
		
		//boolean resultado = func1 == func2;
		boolean resultado = func1.getNome().equals(func2.getNome());
		
		System.out.println(resultado);
		System.out.println(func1);
		System.out.println(func2);
		
		
	}

}




