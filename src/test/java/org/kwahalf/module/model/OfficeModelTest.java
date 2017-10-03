package org.kwahalf.module.model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class OfficeModelTest {
	
	private Office office;
	private Person person;

	@Before
	public void setUp() throws Exception {
		office = new Office("TEST");
		person = new Fellow("TestPerson", true);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testIsOffice() {
		assertTrue("This is not an office",office.getPurpose().equals("OFFICE") );
		assertTrue("This is not an office named TEST",office.getRoomName().equals("TEST") );
		assertTrue("Max capacity of an office is 6 people",office.getMaxCapacity().equals(6) );
		office.setOccupants(person);
		assertTrue("TestPerson is an occupant", office.getOccupantsByIndex(0).getPersoName().equals("TestPerson"));
		
	}

}
