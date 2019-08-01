package it.ats.app.repository.impl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;

import it.ats.app.domain.Dictionaries;
import it.ats.app.domain.Dictionary;
import it.ats.app.repository.DictionaryRepo;
import it.ats.app.repository.data.JsonData;

public class DictionaryRepoImpl implements DictionaryRepo {

	private Dictionary dictionary;
	
	public DictionaryRepoImpl() {
		this.dictionary = new Dictionary();
	}
	
	@Override
	public List<Dictionary> findAll() {
		List<Dictionary> lista = new ArrayList<Dictionary>();
		lista.add(findByLanguage("ita"));
		lista.add(findByLanguage("eng"));
		lista.add(findByLanguage("fra"));
		return lista;
	}
	
	@Override
	public Dictionary findByLanguage(String lang) {
		Gson g = new Gson();
		JsonData jsonData = new JsonData();
		String json = jsonData.getDictionaryString(lang);
		return g.fromJson(json, Dictionary.class);
	}

	public List<String> listFromJson(String lang) {
		Gson g = new Gson();
		JsonData jsonData = new JsonData();
		
						
		Dictionary dic = g.fromJson(jsonData.getDictionaryString(lang), Dictionary.class);
				
		return dic.getListaParole();
	}

}
