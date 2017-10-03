package org.kwahalf.dojo.dojo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DojoTest {

	private Dojo dojo;

	@Before
	public void setUp() throws Exception {
		dojo = new Dojo();
	}

	@After
	public void tearDown() throws Exception {
		dojo = null;
	}

	@Test
	public void testCreateOffice() {
		assertTrue("Office is not created",dojo.createRoom("Orange", "Office") );
		assertTrue("Office is not created",dojo.createRoom("pink", "OFFice") );
		assertTrue("LivingSpace is not created",dojo.createRoom("Brown", "livingSpace") );
		assertTrue("LivingSpace is not created",dojo.createRoom("Green", "LiVingSpace") );
		assertFalse("Kitchen is not a valid room type",dojo.createRoom("Blue", "Kitchen") );
		assertFalse("Green livingSpace already exists You cant dupliacte it",dojo.createRoom("Green", "LiVingSpace") );
		
		
	}

}
