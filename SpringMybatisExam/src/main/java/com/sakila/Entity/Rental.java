package com.sakila.Entity;

import java.sql.Date;

import com.hand.Entity.EntityWithID;

public class Rental extends EntityWithID {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2587941466836153907L;
	private Date rental_date;
	private int inventory_id;
	private int customer_id;
	private Date return_date;
	private int staff_id;
	private Date last_update;

	@Override
	public void setID(long ID) {
		this.ID = ID;
	}

	@Override
	public long getID() {
		return this.ID;
	}

	public Date getRental_date() {
		return rental_date;
	}

	public void setRental_date(Date rental_date) {
		this.rental_date = rental_date;
	}

	public int getInventory_id() {
		return inventory_id;
	}

	public void setInventory_id(int inventory_id) {
		this.inventory_id = inventory_id;
	}

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public Date getReturn_date() {
		return return_date;
	}

	public void setReturn_date(Date return_date) {
		this.return_date = return_date;
	}

	public int getStaff_id() {
		return staff_id;
	}

	public void setStaff_id(int staff_id) {
		this.staff_id = staff_id;
	}

	public Date getLast_update() {
		return last_update;
	}

	public void setLast_update(Date last_update) {
		this.last_update = last_update;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Rental [ID=" + ID + ", rental_date=" + rental_date + ", inventory_id=" + inventory_id + ", customer_id="
				+ customer_id + ", return_date=" + return_date + ", staff_id=" + staff_id + ", last_update="
				+ last_update + "]";
	}

}
