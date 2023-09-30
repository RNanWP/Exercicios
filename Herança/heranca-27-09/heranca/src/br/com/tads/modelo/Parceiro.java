package br.com.tads.modelo;

public class Parceiro implements Autenticavel{

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
