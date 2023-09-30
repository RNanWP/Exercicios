package br.com.tads.modelo;

public class Gerente extends Vendedor implements Autenticavel {
	
	public Gerente(int matricula, String nome, double salarioBruto) {
		super(matricula, nome, salarioBruto);
	}

	@Override
	public void calcularComissao(double preco) {
		super.comissao += (preco * 0.005);
	}
	
	@Override
	public double calcularBonificacao() {
		return super.calcularBonificacao() + 500;
	}

	private int senha;
	
	@Override
	public int getSenha() {
		return senha;
	}

	@Override
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	
}





