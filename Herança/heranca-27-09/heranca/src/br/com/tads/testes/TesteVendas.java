package br.com.tads.testes;

import java.util.ArrayList;

import br.com.tads.modelo.Carro;
import br.com.tads.modelo.Gerente;
import br.com.tads.modelo.Venda;
import br.com.tads.modelo.Vendedor;
import br.com.tads.modelo.VendedorNivel1;
import br.com.tads.modelo.VendedorNivel2;
import br.com.tads.modelo.VendedorNivel3;

public class TesteVendas {

	public static void main(String[] args) {
		
		//LISTAGEM DE CARROS
		Carro fox = new Carro("VW","Fox","Preto",35000);
		Carro onix = new Carro("Chevrolet","Onix","Branco",50000);
		Carro uno = new Carro("Fiat","Uno","Vermelho",45000);
		Carro prisma = new Carro("Chevrolet","Prisma","Azul",55000);
		Carro palio = new Carro("Fiat","Palio","Prata",38000);
		
		//LISTAGEM DOS VENDEDORES
		ArrayList<Vendedor> vendedores= new ArrayList<>();
		vendedores.add(new VendedorNivel1(2010,"Francisca Vieira",3000));
		vendedores.add(new VendedorNivel2(2020,"Pedro Guilherme",3000));
		vendedores.add(new VendedorNivel3(2030,"Flaviana Nunes",3000));
		vendedores.add(new Gerente(3010,"Domenico George",3000));
		
		//VENDAS - Carros e Vendedores (Registrar a Venda)
		ArrayList<Venda> vendas = new ArrayList<>();
		vendas.add(new Venda(vendedores.get(0), fox));
		vendas.add(new Venda(vendedores.get(0), onix));
		vendas.add(new Venda(vendedores.get(1), uno));
		vendas.add(new Venda(vendedores.get(1), prisma));
		vendas.add(new Venda(vendedores.get(2), palio));
		
		//RELATÓRIO DE VENDAS
		System.out.println("*********** RELATÓRIO ************");
		for(Venda venda:vendas) {
			System.out.println(venda.getVendedor().getClass().getSimpleName() + 
					"(Matrícula/Nome/Carro/Preço): "
					+ venda.getVendedor().getMatricula() + "/"
					+ venda.getVendedor().getNome() + "/"
					+ venda.getCarro().getModelo() + "/"
					+ venda.getCarro().getPreco()
			);
			
			if(venda.getVendedor().getClass().getSimpleName().equals("VendedorNivel1"))
				venda.getVendedor().calcularComissao(venda.getCarro().getPreco());
			
			if(venda.getVendedor().getClass().getSimpleName().equals("VendedorNivel2"))
				venda.getVendedor().calcularComissao(venda.getCarro().getPreco());
			
			if(venda.getVendedor().getClass().getSimpleName().equals("VendedorNivel3"))
				venda.getVendedor().calcularComissao(venda.getCarro().getPreco());
			
		}
		
		vendedores.get(3).calcularComissao(Venda.getVendaTotal());
		
		System.out.println("******************************************");
		System.out.println("TOTAL EM VENDAS: " + Venda.getVendaTotal());
		
		System.out.println("\n\n");
		
		for(Vendedor vendedor:vendedores) {
			System.out.println(vendedor);
			System.out.println();
		}
		
		
		
	}
}














