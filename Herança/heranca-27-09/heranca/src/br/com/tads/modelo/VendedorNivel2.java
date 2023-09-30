package br.com.tads.modelo;

public class VendedorNivel2 extends Vendedor {

	public VendedorNivel2(int matricula, String nome, double salarioBruto) {
		super(matricula, nome, salarioBruto);
	}

	@Override
	public void calcularComissao(double preco) {
		super.comissao += (preco * 0.006);
	}
	
}
