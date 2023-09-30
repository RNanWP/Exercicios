package br.com.tads.testes;

import br.com.tads.modelo.Gerente;
import br.com.tads.modelo.Parceiro;
import br.com.tads.modelo.VendedorNivel1;
import br.com.tads.sistema.SistemaInterno;

public class TesteAcessoSistema {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente(3010,"Domenico George",6500);
		gerente.setSenha(1234);
		
		VendedorNivel1 vn1 = new VendedorNivel1(2010,"Pedro Guilherme", 3000);
		vn1.setSenha(1234);
		
		Parceiro parceiro = new Parceiro();
		parceiro.setSenha(1234);
		
		SistemaInterno si = new SistemaInterno();
		si.loginRestrito(gerente);
		si.loginRestrito(vn1);
		si.loginRestrito(parceiro);

	}

}
