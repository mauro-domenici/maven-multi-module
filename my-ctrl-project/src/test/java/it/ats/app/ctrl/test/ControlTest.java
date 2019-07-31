package it.ats.app.ctrl.test;

import org.junit.Test;
import org.junit.*;

import it.ats.app.controller.DictionaryController;
import it.ats.app.controller.impl.DictionaryControllerImpl;
import it.ats.app.domain.Search;

public class ControlTest {
	@Test
	public void processTest() {
		DictionaryController dController = new DictionaryControllerImpl();
		
		dController.process("mauro");

	}
}
