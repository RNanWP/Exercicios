package br.com.tads.modelo;

public class Venda {
	
	private Vendedor vendedor; //Composição: Representa os vendedores (polimorfismo)
	private Carro carro;		//Composição: Representa o carro vendido
	private static double vendaTotal;
	
	public Venda(Vendedor vendedor, Carro carro) {
		this.vendedor = vendedor;
		this.carro = carro;
		Venda.vendaTotal += carro.getPreco();
	}
	
	//Somente os Getters
	public Vendedor getVendedor() {
		return vendedor;
	}
	public Carro getCarro() {
		return carro;
	}
	public static double getVendaTotal() {
		return vendaTotal;
	}
	
}
