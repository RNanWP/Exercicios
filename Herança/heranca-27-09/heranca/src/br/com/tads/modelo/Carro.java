package br.com.tads.modelo;

public class Carro {
	
	//CONSTRUTOR
	public Carro(String marca, String modelo, String cor, double preco) {
		this.marca = marca;
		this.modelo = modelo;
		this.cor = cor;
		this.preco = preco;
	}
	
	//PROPRIEDADES OU ATRIBUTOS
	private String marca;
	private String modelo;
	private String cor;
	private double preco;
	
	//GETTERS E SETTERS
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
}
