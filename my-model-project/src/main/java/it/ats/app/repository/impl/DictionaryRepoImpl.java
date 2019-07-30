package it.ats.app.repository.impl;

import java.util.ArrayList;
import java.util.List;

import it.ats.app.repository.DictionaryRepo;

public class DictionaryRepoImpl implements DictionaryRepo {

	private static List<String> lista;
	
	public DictionaryRepoImpl() {
		lista = new ArrayList<String>();
		lista.add("Mauro");
		lista.add("Francesca");
		lista.add("Fabiana");
		lista.add("Andrea F.");
		lista.add("Andrea L.");
		lista.add("Andrea T.");
	}
	
	@Override
	public List<String> findAll() {
		return lista;
	}

}
