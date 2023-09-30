package br.com.tads.sistema;

import br.com.tads.modelo.Autenticavel;

public class SistemaInterno {
	
	public void loginRestrito(Autenticavel usuario) {
		
		if(usuario.getSenha() == 1234) {
			System.out.println("Acesso Permitido!!!");
		}else {
			System.out.println("Acesso Negado!!!");
		}
		
	}

}
