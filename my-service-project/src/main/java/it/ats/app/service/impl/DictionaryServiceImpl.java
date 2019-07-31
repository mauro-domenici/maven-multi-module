package it.ats.app.service.impl;

import java.util.ArrayList;
import java.util.List;

import it.ats.app.domain.Search;
import it.ats.app.repository.DictionaryRepo;
import it.ats.app.repository.impl.DictionaryRepoImpl;
import it.ats.app.service.DictionaryService;

public class DictionaryServiceImpl implements DictionaryService {

	private DictionaryRepo dictionaryRepo;
	
	public DictionaryServiceImpl() {
		this.dictionaryRepo = new DictionaryRepoImpl();
	}
	
	
	@Override
	public List<String> contains(Search portion) {
		
		List<String> lista = dictionaryRepo.findAll();
		List<String> listaContiene = new ArrayList<String>();
		
		String portionString = portion.getPortion();
		portionString = portionString.toLowerCase();
		
		for(String s: lista) {
			if(s.contains(portionString)) {
				listaContiene.add(s);
			}
		}
		return listaContiene;
	}

}
