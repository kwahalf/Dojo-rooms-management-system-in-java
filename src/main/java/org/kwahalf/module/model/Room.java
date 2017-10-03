/**
 * 
 */
package org.kwahalf.module.model;

import java.util.ArrayList;

/**
 * @author denisjuma
 *
 */
public class Room {
	
	private Integer id;
	private String roomName;
	private String purpose;
	private Integer maxCapacity;
	private ArrayList<Person> occupants;
	public static Integer numberOfRooms = 0;
	
	Room(String roomName) {
		super();
		this.id = 0;
		this.roomName = roomName;
		this.purpose = "purpose";
		this.maxCapacity = 0;
		this.occupants = new ArrayList<Person>();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public Integer getMaxCapacity() {
		return maxCapacity;
	}

	public void setMaxCapacity(Integer maxCapacity) {
		this.maxCapacity = maxCapacity;
	}

	public ArrayList<Person> getOccupants() {
		return occupants;
	}
	public Person getOccupantsByIndex(int i) {
		return occupants.get(i);
	}

	public void setOccupants(Person occupant) {
		this.occupants.add(occupant);
	}
}
