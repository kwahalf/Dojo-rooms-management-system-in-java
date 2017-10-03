/**
 * 
 */
package org.kwahalf.module.model;
/**
 * @author denisjuma
 *
 */
public class Fellow extends Person {

	Fellow( String persoName, Boolean wantsAccomodation) {
		super(persoName,  wantsAccomodation);
		this.setRole("FELLOW");
	}
	
}
