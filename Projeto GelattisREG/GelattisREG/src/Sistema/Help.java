package Sistema;

public class Help {
	
	public String imprimirMenu(){
		return "----- GelattisREG -----" +
			   "\n1 - Operador de Caixa" +
			   "\n2 - Gerente de Piso" +
			   "\n9 - Sair" +
			   "\nEntre com a opção desejada:";
	}
		
	public void imprimirLoginEfetuado(){
		System.out.println("Login efetuado com SUCESSO");
	}
	
	public void imprimirLoginNaoEfetuado(){
		System.err.println("Dados incorretos");
	}
	
	public void solicitarUsuario(){
		System.out.println("Insira seu código:");
	}
	
	public void solicitarSenha(){
		System.out.println("Insira sua senha:");
	}
	
}
