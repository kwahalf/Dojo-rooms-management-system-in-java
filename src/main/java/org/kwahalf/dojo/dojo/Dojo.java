/**
 * 
 */
package org.kwahalf.dojo.dojo;

import java.util.ArrayList;

import org.kwahalf.module.model.LivingSpace;
import org.kwahalf.module.model.Office;
import org.kwahalf.module.model.Person;
import org.kwahalf.module.model.Room;

/**
 * @author denisjuma
 *
 */
class Dojo {
	Dojo() {
		super();
		 this.rooms = new ArrayList<Room>();
		 this.offices = new ArrayList<Room>();
		 this.livingSpaces = new ArrayList<Room>();
		 this.people = new ArrayList<Person>();
		 this.allocatedList = new ArrayList<Person>();
		 this.unallocatedList = new ArrayList<Person>();
	}

	private ArrayList<Room> rooms;
	private ArrayList<Room> offices;
	private ArrayList<Room> livingSpaces;
	private ArrayList<Person> people;
	private ArrayList<Person> allocatedList;
	private ArrayList<Person> unallocatedList;

	
	public ArrayList<Room> getRooms() {
		return rooms;
	}
	
	public Room getRoomsByIndex(int i) {
		return rooms.get(i);
	}

	public void setRooms(ArrayList<Room> rooms) {
		this.rooms = rooms;
	}

	public ArrayList<Room> getOffices() {
		return offices;
	}

	public void setOffices(ArrayList<Room> offices) {
		this.offices = offices;
	}

	public ArrayList<Room> getLivingSpaces() {
		return livingSpaces;
	}

	public void setLivingSpaces(ArrayList<Room> livingSpaces) {
		this.livingSpaces = livingSpaces;
	}

	public ArrayList<Person> getPeople() {
		return people;
	}

	public void setPeople(ArrayList<Person> people) {
		this.people = people;
	}

	public ArrayList<Person> getAllocatedList() {
		return allocatedList;
	}

	public void setAllocatedList(ArrayList<Person> allocatedList) {
		this.allocatedList = allocatedList;
	}

	public ArrayList<Person> getUnallocatedList() {
		return unallocatedList;
	}

	public void setUnallocatedList(ArrayList<Person> unallocatedList) {
		this.unallocatedList = unallocatedList;
	}

	private Boolean RoomIsCreated(String roomName) {
		for(int i=0; i< getRooms().size(); i++) {	
			if (getRoomsByIndex(i).getRoomName().equals(roomName)) {
				return true;
			}
		}
		return false;
	}
	
	private void addRooms(Room room ){
		this.rooms.add(room);
		
	}
	
	public Boolean createRoom(String roomName, String purpose) {
		String name =roomName.toUpperCase();
		if (!this.RoomIsCreated(name)) {
			if (purpose.toUpperCase().equals("OFFICE")) {
                Room room = new Office(name);
                this.addRooms(room);
                System.out.printf("%s %s created \n", room.getRoomName(), room.getPurpose());
                return true;
			}
            
			else if (purpose.toUpperCase().equals("LIVINGSPACE")) {
				Room room = new LivingSpace(name);
				this.addRooms(room);
                System.out.printf("%s %s created \n", room.getRoomName(), room.getPurpose());
                return true;
			}
                
            else {
                System.out.printf("%s is not a valid room type. \n", purpose);
                return false;
            }
		}
		else {
			System.out.printf("%s already Exists in Dojo. \n", roomName);
			return false;
		}
	}

	

}
