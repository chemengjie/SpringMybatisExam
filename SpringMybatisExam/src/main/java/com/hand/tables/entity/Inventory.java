package com.hand.tables.entity;

import java.sql.Date;

import com.hand.Entity.EntityWithD;

public class Inventory extends EntityWithD {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4711498780876505384L;
	private int film_id;
	private int store_id;
	private Date last_update;

	@Override
	public void setId(long ID) {
		this.ID = ID;
		
	}

	@Override
	public long getID() {
		// TODO Auto-generated method stub
		return this.ID;
	}

	public int getFilm_id() {
		return film_id;
	}

	public void setFilm_id(int film_id) {
		this.film_id = film_id;
	}

	public int getStore_id() {
		return store_id;
	}

	public void setStore_id(int store_id) {
		this.store_id = store_id;
	}

	public Date getLast_update() {
		return last_update;
	}

	public void setLast_update(Date last_update) {
		this.last_update = last_update;
	}

	@Override
	public String toString() {
		return "Inventory [ID=" + ID + ", film_id=" + film_id + ", store_id=" + store_id + ", last_update="
				+ last_update + "]";
	}

	
}
