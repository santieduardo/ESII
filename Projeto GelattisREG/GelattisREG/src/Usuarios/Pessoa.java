package Usuarios;

public class Pessoa {
	
	private String nome;
	private String codigo;
	private String senha;
	
	public Pessoa(String nome, String codigo, String senha){
		this.nome = nome;
		this.codigo = codigo;
		this.senha = senha;
	}
	
	public void setNome(String valor){
		this.nome = valor;
	}
	
	public String getNome(){
		return this.nome;
	}
	
	public void setCodigo(String valor){
		this.codigo = valor;
	}
	
	public String getCodigo(){
		return this.codigo;
	}
	
	public void setSenha(String valor){
		this.senha = valor;
	}
	
	public String getSenha(){
		return this.senha;
	}

}
