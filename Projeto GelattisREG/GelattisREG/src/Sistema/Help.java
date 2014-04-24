package Sistema;

import Usuarios.Operador;

public class Help {
	
	private Operador op;
	
	public String imprimirMenu(){
		return "----- GelattisREG -----" +
			   "\n1 - Operador de Caixa" +
			   "\n2 - Gerente de Piso" +
			   "\n9 - Sair" +
			   "\nEntre com a opção desejada:";
	}
	
	public boolean verificarLogin(String codigo, String senha){
		if (codigo == op.getCodigo() && senha == op.getSenha()){
			imprimirLoginEfetuado();
			return true;
		}
		
		imprimirLoginNaoEfetuado();
		return false;
		
	}
	
	public void imprimirLoginEfetuado(){
		System.out.println("Login efetuado com SUCESSO");
	}
	
	public void imprimirLoginNaoEfetuado(){
		System.err.println("Dados incorretos");
	}
	
}
