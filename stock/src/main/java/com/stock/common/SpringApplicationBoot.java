package com.stock.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:spring/application.properties")
@ImportResource({ "classpath:spring-mybatis/mybatis-config.xml"})
@ComponentScan(basePackages = {"com.stock"})
public class SpringApplicationBoot {

	private static final Logger logger = LoggerFactory.getLogger(SpringApplicationBoot.class);
	
	public static void main(String[] args) throws InterruptedException {
		
		ApplicationContext ctx = SpringApplication.run(SpringApplicationBoot.class, args);
		
		logger.debug("SpringApplicationBoot starting, ApplicationName:" + ctx.getApplicationName());
	}
}
