package it.ats.app.main;

import it.ats.app.controller.DictionaryController;
import it.ats.app.controller.impl.DictionaryControllerImpl;

public class ApplicationMain {

	public static void main(String[] args) {
		String s = "andrea";
		
		DictionaryController dictionaryController = new DictionaryControllerImpl();
		
		dictionaryController.process(s);

	}

}
