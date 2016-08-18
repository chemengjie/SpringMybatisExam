package com.hand.AOP;

import java.sql.SQLException;

import com.hand.Entity.EntityWithD;
import com.hand.tables.entity.Customer;

public interface CanAddToDb {
	public void AddIdEntity(EntityWithD entity) throws SQLException;
	public void delByID(long ID) throws SQLException;
	public Customer getLastCustomer() throws SQLException;
}
