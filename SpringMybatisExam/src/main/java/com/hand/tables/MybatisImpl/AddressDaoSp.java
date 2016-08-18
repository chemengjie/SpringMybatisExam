package com.hand.tables.MybatisImpl;

import java.sql.SQLException;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.hand.Dao.IDDao;
import com.hand.Entity.EntityWithD;

public class AddressDaoSp extends SqlSessionDaoSupport implements IDDao{

	public EntityWithD getByID(long ID) throws SQLException {
		return this.getSqlSession().selectOne("getByID_Address",ID);
	}

	public void delByID(long ID) throws SQLException {
		this.getSqlSession().delete("delByID_Address",ID);
	}
	public int getCountById(long ID) throws SQLException{
		return this.getSqlSession().selectOne("getCountById_Address",ID);
	}
}
