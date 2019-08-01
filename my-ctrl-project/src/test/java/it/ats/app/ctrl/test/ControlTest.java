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
		System.out.println("----process test-----");
		Assert.assertEquals(6, dController.process("r", false).size());
		
		Assert.assertTrue(dController.process("r", false).contains("mauro"));
		Assert.assertFalse(dController.process("r", false).contains("fabiana"));
		
		Assert.assertEquals(3, dController.process("a", true).size());

		
		

	}
	
	@Test
	public void processLengthTest() {
		DictionaryController dController = new DictionaryControllerImpl();
		System.out.println("----processLength test-----");
		Assert.assertNotNull(dController.processLength("5"));
		Assert.assertNull(dController.processLength("0"));


	}
}
