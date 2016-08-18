package com.hand.tables.entity;

import java.sql.Date;

import com.hand.Entity.EntityWithD;

public class Country extends EntityWithD {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7761856509106749755L;
	private String country;
	private Date last_update;

	
	@Override
	public void setId(long ID) {
		this.ID = ID;
		
	}
	@Override
	public long getID() {
		return this.ID;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Date getLast_update() {
		return last_update;
	}

	public void setLast_update(Date last_update) {
		this.last_update = last_update;
	}

	@Override
	public String toString() {
		return "Country [ID=" + ID + ", country=" + country + ", last_update=" + last_update + "]";
	}

	

}
