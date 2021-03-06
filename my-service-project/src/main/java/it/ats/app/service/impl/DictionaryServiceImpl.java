package it.ats.app.service.impl;

import java.util.ArrayList;
import java.util.List;

import it.ats.app.repository.DictionaryRepo;
import it.ats.app.repository.impl.DictionaryRepoImpl;
import it.ats.app.service.DictionaryService;

public class DictionaryServiceImpl implements DictionaryService {

	private DictionaryRepo dictionaryRepo;
	
	public DictionaryServiceImpl() {
		this.dictionaryRepo = new DictionaryRepoImpl();
	}
	
	
	@Override
	public List<String> contains(CharSequence portion) {
		
		List<String> lista = dictionaryRepo.findAll();
		List<String> listaContiene = new ArrayList<String>();
		
		for(String s: lista) {
			if(s.contains(portion)) {
				listaContiene.add(s);
			}
		}
		return listaContiene;
	}

}
