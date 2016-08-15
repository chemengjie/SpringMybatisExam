package com.hand.dto;

import java.sql.Date;

public class Store {
	private Long store_id;
	private Long manager_staff_id;
	private Long address_id;
	private Date last_update;
	public Long getStore_id() {
		return store_id;
	}
	public void setStore_id(Long store_id) {
		this.store_id = store_id;
	}
	public Long getManager_staff_id() {
		return manager_staff_id;
	}
	public void setManager_staff_id(Long manager_staff_id) {
		this.manager_staff_id = manager_staff_id;
	}
	public Long getAddress_id() {
		return address_id;
	}
	public void setAddress_id(Long address_id) {
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
		return "Store [store_id=" + store_id + ", manager_staff_id=" + manager_staff_id + ", address_id=" + address_id
				+ ", last_update=" + last_update + "]";
	}
	
}
