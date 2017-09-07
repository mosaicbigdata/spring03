package com.example.db;

import java.sql.SQLException;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.support.GenericXmlApplicationContext;

public class DataSourceSpringExample {

	public static void main(String[] args) throws SQLException {
		// DI Container, BeanFactory
		// LifeCycle
		// 1. 객체 생성
		// 2. 객체 초기화
		// 3. dependency injection
		// 4. 객체 사용
		// 5. 객체 소멸
		GenericXmlApplicationContext ctx = 
				new GenericXmlApplicationContext("classpath:/spring/beans.xml");
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("after BeanFacotry create");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@");
		
		CityDao dao = ctx.getBean(CityDao.class);	// Bean 사용
		System.out.println(dao.selectAll());
		
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		System.out.println("before BeanFacotry ctx.close");
		System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
		ctx.close();
	}

}
