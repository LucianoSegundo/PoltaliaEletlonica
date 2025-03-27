package com.LFSotfware.PoltaliaEletlonica.Model.Entidade;

import java.util.ArrayList;
import java.util.List;

public class Funcionario {

	private String nome;
	private String cargo;
	private String email;
	private String  urlPerfil;
	private int idade;
	private boolean entrou;
	private List<ControleEntrada> controleEntrada;
	
	public Funcionario() {
		this.controleEntrada = new ArrayList<ControleEntrada>();
	}
	
	public void inserirControle(ControleEntrada controle ) {
		this.controleEntrada.add(controle);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getEmail() {
		return email;
	}

	public boolean setEmail(String email) {
		
		if (email == null || email.isBlank()) return false;
		
		if (validarEmail(email) == false) return false;
		
		this.email = email;

		return true;
	}

	public String getUrlPerfil() {
		return urlPerfil;
	}

	public void setUrlPerfil(String urlPerfil) {
		this.urlPerfil = urlPerfil;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public boolean isEntrou() {
		return entrou;
	}

	public void setEntrou(boolean entrou) {
		this.entrou = entrou;
	}

	public List<ControleEntrada> getControleEntrada() {
		return controleEntrada;
	}

	public void setControleEntrada(List<ControleEntrada> controleEntrada) {
		this.controleEntrada = controleEntrada;
	}
	
	private boolean validarEmail(String email) {
		if( email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) return true;
			return false;
		}
}
