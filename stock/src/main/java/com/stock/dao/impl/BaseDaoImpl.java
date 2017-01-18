package com.stock.dao.impl;

import javax.annotation.Resource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import com.stock.dao.BaseDao;

public class BaseDaoImpl  extends SqlSessionDaoSupport implements BaseDao{
		
    @Resource(name="sqlSessionFactory")
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory){          
        super.setSqlSessionFactory(sqlSessionFactory);  
    }
    
}
