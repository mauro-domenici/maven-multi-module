package it.ats.app.repository.impl;

import java.util.List;

import it.ats.app.domain.Dictionary;
import it.ats.app.repository.DictionaryRepo;

public class DictionaryRepoImpl implements DictionaryRepo {

	private Dictionary dictionary;
	
	public DictionaryRepoImpl() {
		this.dictionary = Dictionary.getInstance();
	}
	
	@Override
	public List<String> findAll() {
		return this.dictionary.getListaParole();
	}

}
