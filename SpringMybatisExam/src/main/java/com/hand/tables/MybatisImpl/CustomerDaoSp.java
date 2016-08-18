package com.hand.tables.MybatisImpl;

import java.sql.SQLException;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.hand.AOP.CanAddToDb;
import com.hand.Dao.IDDao;
import com.hand.Entity.EntityWithD;
import com.hand.tables.entity.Customer;

public class CustomerDaoSp extends SqlSessionDaoSupport implements IDDao,CanAddToDb {

	public EntityWithD getByID(long ID) throws SQLException {
		// TODO Auto-generated method stub
		return this.getSqlSession().selectOne("getByID_Customer",ID);
	}

	public void delByID(long ID) throws SQLException {
		// TODO Auto-generated method stub
		this.getSqlSession().delete("delByID_Customer",ID);
	}

	public void AddIdEntity(EntityWithD entity) throws SQLException {
		this.getSqlSession().insert("AddIdEntity_Customer", entity);
		
	}

	public Customer getLastCustomer() throws SQLException {
		// TODO Auto-generated method stub
		return this.getSqlSession().selectOne("getLastCustomer_Customer");
	}

}
