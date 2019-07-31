package it.ats.app.service.test;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;


import it.ats.app.service.DictionaryService;
import it.ats.app.service.impl.DictionaryServiceImpl;

public class ServiceTest {
	
	@Test
	public void testDictionaryNoUpperCase() {
		DictionaryService dictionaryService = new DictionaryServiceImpl();
		List<String> lista = dictionaryService.contains("Mauro");
		
		Assert.assertEquals(1, lista.size());
	}

}
