package it.ats.app.repository.impl;

import java.util.ArrayList;
import java.util.List;

import it.ats.app.repository.DictionaryRepo;

public class DictionaryRepoImpl implements DictionaryRepo {

	private static List<String> lista;
	
	public DictionaryRepoImpl() {
		lista = new ArrayList<String>();
		lista.add("mauro");
		lista.add("francesca");
		lista.add("fabiana");
		lista.add("andrea f.");
		lista.add("andrea l.");
		lista.add("andrea t.");
	}
	
	@Override
	public List<String> findAll() {
		return lista;
	}

}
