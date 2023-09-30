package br.com.tads.testes;

import br.com.tads.modelo.Gerente;
import br.com.tads.modelo.VendedorNivel1;
import br.com.tads.modelo.VendedorNivel2;
import br.com.tads.modelo.VendedorNivel3;

public class TesteVendedores {

	public static void main(String[] args) {
		
		VendedorNivel1 vendn1 = new VendedorNivel1(2010,"Francisca Vieira",3000);
		
		System.out.println("----- Vendedor Nivel 1 -----");
		System.out.println("Matrícula: " + vendn1.getMatricula());
		System.out.println("Nome: " + vendn1.getNome());
		System.out.println("Salário: " + vendn1.getSalarioBruto());
		System.out.println("Bonificação: " + vendn1.calcularBonificacao());
//		System.out.println("Comissão: " + vendn1.calcularComissao());
//		System.out.println("Salário + Bonificação + Comissão: " + 
//				(vendn1.getSalarioBruto() + vendn1.calcularBonificacao() + vendn1.calcularComissao()));
	
		System.out.println();
		
		VendedorNivel2 vendn2 = new VendedorNivel2(2020,"Pedro Guilherne",3000);
		
		System.out.println("----- Vendedor Nivel 2 -----");
		System.out.println("Matrícula: " + vendn2.getMatricula());
		System.out.println("Nome: " + vendn2.getNome());
		System.out.println("Salário: " + vendn2.getSalarioBruto());
		System.out.println("Bonificação: " + vendn2.calcularBonificacao());
//		System.out.println("Comissão: " + vendn2.calcularComissao());
//		System.out.println("Salário + Bonificação + Comissão: " + 
//				(vendn2.getSalarioBruto() + vendn2.calcularBonificacao() + vendn2.calcularComissao()));
	
		System.out.println();		

		VendedorNivel3 vendn3 = new VendedorNivel3(2030,"Flaviana Nunes",3000);
		
		System.out.println("----- Vendedor Nivel 3 -----");
		System.out.println("Matrícula: " + vendn3.getMatricula());
		System.out.println("Nome: " + vendn3.getNome());
		System.out.println("Salário: " + vendn3.getSalarioBruto());
		System.out.println("Bonificação: " + vendn3.calcularBonificacao());
//		System.out.println("Comissão: " + vendn3.calcularComissao());
//		System.out.println("Salário + Bonificação + Comissão: " + 
//				(vendn3.getSalarioBruto() + vendn3.calcularBonificacao() + vendn3.calcularComissao()));
	
		System.out.println();		
		
		Gerente ger = new Gerente(3010,"Domenico George",6500);
		
		System.out.println("----- Gerente -----");
		System.out.println("Matrícula: " + ger.getMatricula());
		System.out.println("Nome: " + ger.getNome());
		System.out.println("Salário: " + ger.getSalarioBruto());
		System.out.println("Bonificação: " + ger.calcularBonificacao());
//		System.out.println("Comissão: " + ger.calcularComissao());
//		System.out.println("Salário + Bonificação + Comissão: " + 
//				(ger.getSalarioBruto() + ger.calcularBonificacao() + ger.calcularComissao()));
	}

}
