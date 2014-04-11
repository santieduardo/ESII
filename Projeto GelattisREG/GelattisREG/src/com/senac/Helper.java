package com.senac;

public class Helper {
	
	public String imprimirCargos(){
		return "1 - Operador de Caixa"
			 + "\n2 - Gerente de Piso";
	}
	
	public boolean avaliarOpCaixa(String usuario, String senha){		
		if(usuario == "joao" && senha == "123456"){
			System.out.println("Dados conferidos !");
			return true;
		}
		
		System.err.println("Dados não conferem !");
		return false;
	}

}
