/**
 * 
 */
package org.kwahalf.module.model;

/**
 * @author denisjuma
 *
 */
public class Staff extends Person {

	Staff( String persoName, Boolean wantsAccomodation) {
		super( persoName, wantsAccomodation);
		this.setRole("STAFF");
		this.setWantsAccomodation(false);
	}

}
