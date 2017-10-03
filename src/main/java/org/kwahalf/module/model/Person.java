/**
 * 
 */
package org.kwahalf.module.model;

/**
 * @author denisjuma
 *
 */

public class Person {
	private Integer id;
	private String persoName;
	private String role;
	private Boolean wantsAccomodation;
	public static Integer numberOfpeople = 0;
	
	Person( String persoName, Boolean wantsAccomodation) {
		super();
		this.id = numberOfpeople++;
		this.persoName = persoName;
		this.role = "none";
		this.wantsAccomodation = wantsAccomodation;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPersoName() {
		return persoName;
	}

	public void setPersoName(String persoName) {
		this.persoName = persoName;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Boolean getWantsAccomodation() {
		return wantsAccomodation;
	}

	public void setWantsAccomodation(Boolean wantsAccomodation) {
		this.wantsAccomodation = wantsAccomodation;
	}
	
	
	
	
}
