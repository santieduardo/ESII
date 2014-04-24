package Sistema;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Help help = new Help();

		System.out.println(help.imprimirMenu());
		String cmd = sc.next();

		switch (cmd) {
		case "1":
			System.out.println("\nEntre com o login e senha de Operador !");
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
