package com.hand.tables.MybatisImpl;

import java.sql.SQLException;

import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.hand.Dao.IDDao;
import com.hand.Entity.EntityWithD;

public class StoreDaoSp extends SqlSessionDaoSupport implements IDDao{

	public EntityWithD getByID(long ID) throws SQLException {
		// TODO Auto-generated method stub
		return this.getSqlSession().selectOne("getByID_Store",ID);
	}

	public void delByID(long ID) throws SQLException {
		// TODO Auto-generated method stub
		this.getSqlSession().delete("getByID_Store",ID);
	}

}
