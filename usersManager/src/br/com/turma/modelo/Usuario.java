package br.com.turma.modelo;

import java.util.Date;

public class Usuario {
	
	//Construtor com campos (Obs.: sem o codigo)
	public Usuario(String nome, Date dataNasc, String usuario, String senha) {
		this.nome = nome;
		this.dataNasc = dataNasc;
		this.usuario = usuario;
		this.senha = senha;
	}
	
	//Propriedades ou Atributos
	private Integer codigo;
	private String nome;
	private Date dataNasc;
	private String usuario;
	private String senha;
	
	
	//M�todos Getters e Setters
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
}
