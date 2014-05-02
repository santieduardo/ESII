package TesteSistema;

import java.util.Scanner;

import Usuarios.Gerente;
import Usuarios.Operador;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Help help = new Help();
		Operador operador = new Operador("João", 6312, 5555);
		Gerente gerente = new Gerente("Maria", 6312, 3333);

		System.out.println(help.imprimirMenu());
		String cmd = sc.next();
		
		int codigo;
		int senha;
		
		switch (cmd) {
		case "1":
			
			help.solicitarUsuario();
			codigo = sc.nextInt();
			help.solicitarSenha();
			senha = sc.nextInt();
			operador.verificarLogin(codigo, senha);
			break;

		case "2":
			help.solicitarUsuario();
			codigo = sc.nextInt();
			help.solicitarSenha();
			senha = sc.nextInt();
			gerente.verificarLogin(codigo, senha);
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
