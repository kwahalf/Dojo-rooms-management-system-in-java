package org.kwahalf.module.model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LivingSpaceModelTest {
	
	private LivingSpace livingSpace;
	private Person person;

	@Before
	public void setUp() throws Exception {
		livingSpace = new LivingSpace("TEST");
		person = new Fellow("TestPerson", true);
	}

	@After
	public void tearDown() throws Exception {
		livingSpace = null;
		person = null;
	}

	@Test
	public void testIsOffice() {
		assertTrue("This is not a living space",livingSpace.getPurpose().equals("LivingSpace") );
		assertTrue("This is not a living space named TEST",livingSpace.getRoomName().equals("TEST") );
		assertTrue("Max capacity of a living space is 4 people",livingSpace.getMaxCapacity().equals(4) );
		livingSpace.setOccupants(person);
		assertTrue("TestPerson is an occupant", livingSpace.getOccupantsByIndex(0).getPersonName().equals("TestPerson"));
		
	}

}
