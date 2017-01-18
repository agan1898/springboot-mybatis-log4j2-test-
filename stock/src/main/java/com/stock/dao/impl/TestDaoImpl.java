package com.stock.dao.impl;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.stock.dao.TestDao;
import com.stock.entity.TestEntity;

@Repository
public class TestDaoImpl  extends BaseDaoImpl implements TestDao{
	
	private static final String NAME_SPACE = TestDaoImpl.class.getName();
    
	public List<TestEntity> getBaseEntity(){
		return this.getSqlSession().selectList(NAME_SPACE + ".getBaseEntity");
	}
}
