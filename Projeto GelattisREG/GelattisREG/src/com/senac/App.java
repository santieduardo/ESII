package com.senac;

import java.util.Scanner;

public class App {
	
	private String usuario;
	private  String senha;
	
	Scanner sc = new Scanner(System.in);
	Helper help = new Helper();	

	public App() {		
		
		System.out.println("--- GelattisRED ---");
		
		System.out.println("\nDigite o código do seu cargo:");
		System.out.println(help.imprimirCargos());
		
		String codCargo = sc.next();
		avaliarCargo(codCargo);
		
		solicitarDados();
		
		help.avaliarOpCaixa(usuario, senha);
		
		
		

	}	
	
	public static void avaliarCargo(String codCargo){
		switch (codCargo){
		case "1":
			System.out.println("Você é um Operador de Caixa?");
			break;
			
		case "2":
			System.out.println("Você é um Gerente de Piso?");
			break;
		
		default:
			System.err.println("Ops! Código incorreto");
		}
	}
	
	public void solicitarDados(){
		System.out.println("Digite seu usuario");
		usuario = sc.next();
		
		System.out.println("Digite sua senha");
		senha = sc.next();
		
	}

}
