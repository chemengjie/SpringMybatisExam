package com.hand.tables.entity;

import java.sql.Date;

import com.hand.Entity.EntityWithD;

public class Category extends EntityWithD {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8041148392172242292L;
	private String name;
	private Date last_update;

	@Override
	public void setId(long ID) {
		this.ID=ID;
		
	}
	@Override
	public long getID() {
		// TODO Auto-generated method stub
		return this.ID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getLast_update() {
		return last_update;
	}

	public void setLast_update(Date last_update) {
		this.last_update = last_update;
	}

	@Override
	public String toString() {
		return "Category [ID=" + ID + ", name=" + name + ", last_update=" + last_update + "]";
	}



}
