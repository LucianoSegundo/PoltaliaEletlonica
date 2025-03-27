package com.LFSotfware.PoltaliaEletlonica.Model.Repositorio;

public interface Repositorio<T> {

	  public void inserir(T item);
	  public void remover(T item);
	  public void alterar(T item);
	  public T ler ();
}
