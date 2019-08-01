package it.ats.app.domain;

import java.util.ArrayList;
import java.util.List;

import it.ats.app.repository.DictionaryRepo;
import it.ats.app.repository.impl.DictionaryRepoImpl;

public class Dictionary {
	private static Dictionary instance = null;
	private List<String> listaParole;
	private DictionaryRepo dRepo;
	private Integer id;
	private String lang;
	
	
	private Dictionary() {
//		this.dRepo = new DictionaryRepoImpl();
//		this.id = id;
//		this.lang = lang;
		this.listaParole = new ArrayList<String>();
		this.listaParole.add("mauro");
		this.listaParole.add("fabiana");
		this.listaParole.add("francesca");
		this.listaParole.add("jerry");
		this.listaParole.add("andrea f.");
		this.listaParole.add("andrea l.");
		this.listaParole.add("andrea t.");
	}
	
	public List<String> getListaParole(){
		return this.listaParole;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getLang() {
		return lang;
	}

	public void setLang(String lang) {
		this.lang = lang;
	}
	
	public static Dictionary getInstance() {
		
		if (instance == null) {
			instance = new Dictionary();
		}
		return instance;
	}
}
