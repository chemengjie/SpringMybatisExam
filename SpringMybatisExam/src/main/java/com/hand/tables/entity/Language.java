package com.hand.tables.entity;

import java.sql.Date;

import com.hand.Entity.EntityWithD;

public class Language extends EntityWithD {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2082688610470725503L;
	private String name;
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
	
	//这个setter是为了兼容Mybatis，不使用整合框架可以不写
	public void setLanguage_id(long ID){
		this.ID=ID;
	}
	
	//这个getter是为了兼容Mybatis，不使用整合框架可以不写
	public Long getFilmLanguage_id(){
		return this.ID;
	}

	@Override
	public String toString() {
		return "Language [ID=" + ID + ", name=" + name + ", last_update=" + last_update + "]";
	}

	
}
