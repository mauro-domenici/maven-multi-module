package it.ats.app.controller.impl;

import java.util.List;

import it.ats.app.controller.DictionaryController;
import it.ats.app.domain.Search;
import it.ats.app.service.DictionaryService;
import it.ats.app.service.impl.DictionaryServiceImpl;


public class DictionaryControllerImpl implements DictionaryController {

	private DictionaryService dictionaryService;
	
	public DictionaryControllerImpl() {
		this.dictionaryService = new DictionaryServiceImpl();
	}
	
	@Override
	public void process(String s, boolean b) {
		Search search = new Search(s);
		search.setInitial(b);
		
		List<String> lista = dictionaryService.contains(search);
		for(String parola: lista) {
			System.out.println(parola);
		}
	}
	
	

	@Override
	public void processLength(String s) {
		int length = Integer.parseInt(s);
		Search search = new Search();
		search.setLenght(length);
		
		List<String> lista = dictionaryService.measures(search);
		
		for(String parola: lista) {
			System.out.println(parola);
		}
		
	}

	

}
