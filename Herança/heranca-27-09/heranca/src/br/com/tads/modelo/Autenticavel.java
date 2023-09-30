package br.com.tads.modelo;

//COMO A CLASSE ABSTRATA NÃO É POSSÍVEL CRIAR (INSTANCIAR) OBJETOS
public interface Autenticavel {

	//EM UMA INTERFACE SOMENTE EXISTE MÉTODOS ABSTRATOS
	public int getSenha();
	public void setSenha(int senha);
	
}
