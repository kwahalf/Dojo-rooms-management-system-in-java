package org.kwahalf.module.model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FellowModelTest {
	
	private Fellow person;

	@Before
	public void setUp() throws Exception {
		person = new Fellow("TestPerson", true);
	}

	@After
	public void tearDown() throws Exception {
		person = null;
	}

	@Test
	public void testIsOffice() {
		assertTrue("This is not a Fellow",person.getRole().equals("FELLOW") );
		assertTrue("This Fellow wants accomodation",person.getWantsAccomodation().equals(true) );
		assertTrue("Fellow name is TestPerson",person.getPersonName().equals("TestPerson"));
	}

}
