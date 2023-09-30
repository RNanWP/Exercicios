package br.com.tads.modelo;

public class Funcionario {
	
	public Funcionario(int matricula, String nome, double salarioBruto) {
		this.matricula = matricula;
		this.nome = nome;
		this.salarioBruto = salarioBruto;
	}
	
	private int matricula;
	private String nome;
	private double salarioBruto;
	
	
	public double calcularBonificacao() {
		return this.salarioBruto * 0.05;
	}
	
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalarioBruto() {
		return salarioBruto;
	}
	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}
	
	@Override
	public String toString() {
		return "----------------" + this.getClass().getSimpleName() + "------------------"
				+ "\nMatrícula: " + this.getMatricula()
				+ "\nNome: " + this.getNome()
				+ "\nSalário Bruto: " + this.getSalarioBruto()
				+ "\nBonificação: " + this.calcularBonificacao();
	}

}







