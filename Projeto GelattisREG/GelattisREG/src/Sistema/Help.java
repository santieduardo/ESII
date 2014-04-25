package Sistema;

public class Help {
	
	public String imprimirMenu(){
		return "----- GelattisREG -----" +
			   "\n1 - Operador de Caixa" +
			   "\n2 - Gerente de Piso" +
			   "\n9 - Sair" +
			   "\nEntre com a op��o desejada:";
	}
		
	public void imprimirLoginEfetuado(){
		System.out.println("Login efetuado com SUCESSO");
		System.err.println("CAIXA LIBERADO");
	}
	
	public void imprimirLoginNaoEfetuado(){
		System.err.println("Dados incorretos");
	}
	
	public void solicitarUsuario(){
		System.out.println("Insira seu c�digo:");
	}
	
	public void solicitarSenha(){
		System.out.println("Insira sua senha:");
	}
	
}
