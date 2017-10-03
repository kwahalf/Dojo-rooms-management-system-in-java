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
		this.setRole("Staff");
		this.setWantsAccomodation(false);
	}

}
