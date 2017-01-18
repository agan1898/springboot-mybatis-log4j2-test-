package com.stock.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stock.dao.TestDao;
import com.stock.dao.impl.BaseDaoImpl;
import com.stock.entity.TestEntity;
import com.stock.service.TestService;

@Service
public class TestServiceImpl extends BaseDaoImpl implements TestService{
	
	@Autowired 
	private TestDao testDao;
	
	public List<TestEntity> getBaseEntity(){
		return testDao.getBaseEntity();
	}
	
}
