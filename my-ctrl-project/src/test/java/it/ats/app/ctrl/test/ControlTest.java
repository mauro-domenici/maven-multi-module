package it.ats.app.ctrl.test;

import org.junit.Test;
import org.junit.*;

import it.ats.app.controller.DictionaryController;
import it.ats.app.controller.impl.DictionaryControllerImpl;

public class ControlTest {
	@Test
	public void processTest() {
		DictionaryController dController = new DictionaryControllerImpl();
		System.out.println("----process test-----");

		dController.process("r", false);

	}
	
	@Test
	public void processLengthTest() {
		DictionaryController dController = new DictionaryControllerImpl();
		System.out.println("----processLength test-----");
		dController.processLength("5");
		
	}
}
