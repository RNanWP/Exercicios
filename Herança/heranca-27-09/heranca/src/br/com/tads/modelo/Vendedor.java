package br.com.tads.modelo;

//CLASSES ABSTRATAS NÃO INSTANCIAM (CRIAM) OBJETOS
public abstract class Vendedor extends Funcionario{
	
	public Vendedor(int matricula,String nome, double salarioBruto) {
		super(matricula,nome,salarioBruto);
	}
	
	protected double comissao;
	
	//MÉTODOS ABSTRATOS NÃO POSSUI IMPLEMENTAÇÃO
	public abstract void calcularComissao(double preco);
	
	public double getComissao() {
		return comissao;
	}
	
	@Override
	public String toString() {
		return super.toString()
				+ "\nComissão: " + this.getComissao()
				+ "\nSalário + Bonificação + Comissão: "
				+ (this.getSalarioBruto() + this.calcularBonificacao() + this.getComissao());
	}
	
}





