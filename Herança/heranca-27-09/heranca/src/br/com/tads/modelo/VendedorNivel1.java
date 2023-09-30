package br.com.tads.modelo;

public class VendedorNivel1 extends Vendedor implements Autenticavel{
	
	public VendedorNivel1(int matricula, String nome, double salarioBruto) {
		super(matricula, nome, salarioBruto);
	}

	@Override
	public void calcularComissao(double preco) {
		super.comissao += (preco * 0.01);
	}
	
	private int senha;

	@Override
	public int getSenha() {
		return senha;
	}

	@Override
	public void setSenha(int senha) {
		this.senha =senha;
	}

}
