package org.kwahalf.module.model;

public class Office extends Room{

	public Office(String roomName) {
		super(roomName);
		numberOfRooms++;
		this.setId(numberOfRooms);
		this.setPurpose("OFFICE");
		this.setMaxCapacity(6);
	}

}
