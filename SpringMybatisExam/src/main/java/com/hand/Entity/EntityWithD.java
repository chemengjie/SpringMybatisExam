package com.hand.Entity;

import java.io.Serializable;

public abstract class EntityWithD implements Serializable{

	private static final long serialVersionUID = 1L;
	protected Long ID;
	
	public abstract void setId(long ID);
	
	public abstract long getID();
}
