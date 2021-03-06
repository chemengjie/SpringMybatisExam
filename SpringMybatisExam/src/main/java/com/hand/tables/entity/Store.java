package com.hand.tables.entity;

import java.sql.Date;

import com.hand.Entity.EntityWithD;

public class Store extends EntityWithD {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4397311012542776459L;
	private int manager_staff_id;
	private int address_id;
	private Date last_update;

	@Override
	public void setId(long ID) {
		this.ID = ID;
		
	}

	@Override
	public long getID() {
		return this.ID;
	}

	public int getManager_staff_id() {
		return manager_staff_id;
	}

	public void setManager_staff_id(int manager_staff_id) {
		this.manager_staff_id = manager_staff_id;
	}

	public int getAddress_id() {
		return address_id;
	}

	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}

	public Date getLast_update() {
		return last_update;
	}

	public void setLast_update(Date last_update) {
		this.last_update = last_update;
	}

	@Override
	public String toString() {
		return "Store [ID=" + ID + ", manager_staff_id=" + manager_staff_id + ", address_id=" + address_id
				+ ", last_update=" + last_update + "]";
	}

	

}
