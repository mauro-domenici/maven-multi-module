package it.ats.app.domain;

import java.util.ArrayList;
import java.util.List;

public class Dictionary {
	private static Dictionary instance = null;
	private List<String> listaParole;
	
	private Dictionary() {
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
	
	public static Dictionary getInstance() {
		
		if (instance == null) {
			instance = new Dictionary();
		}
		return instance;
	}
}
