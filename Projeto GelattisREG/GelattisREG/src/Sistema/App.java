package Sistema;

import java.util.Scanner;

import Usuarios.Operador;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Help help = new Help();
		Operador operador = new Operador("João", "6312", "5555");

		System.out.println(help.imprimirMenu());
		String cmd = sc.next();

		switch (cmd) {
		case "1":
			String codigo;
			String senha;
			
			System.out.println("Entre com seu código:");
			codigo = sc.next();
			System.out.println("Entre com sua senha:");
			senha = sc.next();
			
			help.verificarLogin(codigo, senha);
			
			break;

		case "2":
			System.out.println("\nEntre com o login e senha de Gerente !");
			break;

		case "9":
			System.err.println("Programa encerrado !");
			System.exit(0);
			break;

		default:
			System.err.println("Ops, opção inválida !");
			break;
		}

	}
}
