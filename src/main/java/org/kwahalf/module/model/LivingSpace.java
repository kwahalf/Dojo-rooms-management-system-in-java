/**
 * 
 */
package org.kwahalf.module.model;

/**
 * @author denisjuma
 *
 */
public class LivingSpace extends Room {

	public LivingSpace(String roomName) {
		super(roomName);
		numberOfRooms++;
		this.setId(numberOfRooms);
		this.setPurpose("LivingSpace");
		this.setMaxCapacity(4);
	}

}
