package com.hand.tables.entity;

import java.sql.Date;

import com.hand.Entity.EntityWithD;

public class City extends EntityWithD {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7799471845947864722L;
	private String city;
	private int country_id;
	private Date last_update;
	
	@Override
	public void setId(long ID) {
		this.ID = ID;
		
	}
	@Override
	public long getID() {
		return this.ID;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getCountry_id() {
		return country_id;
	}

	public void setCountry_id(int country_id) {
		this.country_id = country_id;
	}

	public Date getLast_update() {
		return last_update;
	}

	public void setLast_update(Date last_update) {
		this.last_update = last_update;
	}

	@Override
	public String toString() {
		return "City [ID=" + ID + ", city=" + city + ", country_id=" + country_id + ", last_update=" + last_update
				+ "]";
	}

	

}
