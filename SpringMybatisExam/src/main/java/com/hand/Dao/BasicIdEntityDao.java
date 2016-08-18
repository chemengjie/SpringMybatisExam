package com.hand.Dao;

import java.sql.SQLException;

import com.hand.Entity.EntityWithD;

public interface BasicIdEntityDao extends IDDao {
	/*
	 * 向数据库中修改一个对象
	 */
	public void ModifyIdEntity(EntityWithD entity) throws SQLException;
	
	/*
	 * 向数据库中添加一个对象
	 */
	public void AdDIdEntity(EntityWithD entity) throws SQLException;
}
