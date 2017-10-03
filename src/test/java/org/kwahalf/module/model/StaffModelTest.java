package org.kwahalf.module.model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StaffModelTest {
	
	private Staff person;

	@Before
	public void setUp() throws Exception {
		person = new Staff("TestPerson", true);
	}

	@After
	public void tearDown() throws Exception {
		person = null;
	}

	@Test
	public void testIsOffice() {
		assertTrue("This is not a Staff",person.getRole().equals("STAFF") );
		assertTrue("Accomodation is not provided for Staff",person.getWantsAccomodation().equals(false) );
		assertTrue("Staff name is TestPerson",person.getPersonName().equals("TestPerson"));
	}

}
