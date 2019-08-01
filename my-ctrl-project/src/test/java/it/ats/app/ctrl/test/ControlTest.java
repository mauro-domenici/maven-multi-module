package it.ats.app.ctrl.test;

import org.junit.Test;

import java.util.List;

import org.junit.*;

import it.ats.app.controller.DictionaryController;
import it.ats.app.controller.impl.DictionaryControllerImpl;

public class ControlTest {
	@Test
	public void processTest() {
		DictionaryController dController = new DictionaryControllerImpl();
		Assert.assertEquals(6, dController.process("r", "ita", false).size());

		
		

	}
	
	@Test
	public void processLengthTest() {
		DictionaryController dController = new DictionaryControllerImpl();
		Assert.assertNotNull(dController.processLength("5","ita"));
		Assert.assertNull(dController.processLength("0","ita"));


	}
}
