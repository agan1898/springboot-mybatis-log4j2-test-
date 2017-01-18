package com.stock.test.mybatis;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.stock.common.SpringApplicationBoot;
import com.stock.entity.TestEntity;
import com.stock.service.TestService;

@RunWith(SpringJUnit4ClassRunner.class)  
@SpringBootTest(classes = SpringApplicationBoot.class)
public class SpringMybatisTest {

	private static final Logger logger = LoggerFactory.getLogger(SpringMybatisTest.class);

    @Autowired
    private TestService testService;
    
    @Test
    public void testFindByLastName() {
    	List<TestEntity> testEntities = (List<TestEntity>)testService.getBaseEntity();
    	logger.debug(String.valueOf(testEntities.size()));
    }

}
