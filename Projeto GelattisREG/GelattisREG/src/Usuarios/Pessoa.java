package Usuarios;

import Sistema.Help;

public class Pessoa {
	
	private String nome;
	private int codigo;
	private int senha;
	
	public Pessoa(String nome, int codigo, int senha){
		this.nome = nome;
		this.codigo = codigo;
		this.senha = senha;
	}
	
	public Pessoa(){
		
	}
	
	public void setNome(String valor){
		this.nome = valor;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void setCodigo(int valor){
		this.codigo = valor;
	}
	
	public int getCodigo(){
		return this.codigo;
	}
	
	public void setSenha(int valor){
		this.senha = valor;
	}
	
	public int getSenha(){
		return this.senha;
	}
	
	public boolean verificarLogin(int codigo, int senha){
		Help help = new Help();
		if (getCodigo() == codigo && getSenha() == senha){
			help.imprimirLoginEfetuado();
			return true;
		}
		
		help.imprimirLoginNaoEfetuado();
		return false;
		
	}
}
