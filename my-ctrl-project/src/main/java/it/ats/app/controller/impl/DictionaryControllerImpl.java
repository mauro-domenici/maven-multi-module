package it.ats.app.controller.impl;

import java.util.List;

import it.ats.app.controller.DictionaryController;
import it.ats.app.service.DictionaryService;
import it.ats.app.service.impl.DictionaryServiceImpl;


public class DictionaryControllerImpl implements DictionaryController {

	private DictionaryService dictionaryService;
	
	public DictionaryControllerImpl() {
		this.dictionaryService = new DictionaryServiceImpl();
	}
	
	@Override
	public void process(String s) {
		
		List<String> lista = dictionaryService.contains(s);
		for(String parola: lista) {
			System.out.println(parola);
		}
	}

}
