package com.LFSotfware.PoltaliaEletlonica.Model.Entidade;

public class Porteiro extends Funcionario {
	
	private String senha;
	
	public Porteiro(){}
	
	public String getSenha() {
		return senha;
	}

	public boolean setSenha(String senha) {
		if(senha == null || senha.isBlank()) return false;
		if(senha.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[A-Za-z\\d]{8,}$\n")) return false;
		this.senha = senha;
		
		return true;
	}
	
	
}
