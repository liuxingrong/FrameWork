package com.team.controller;

import java.sql.SQLException;

import org.apache.commons.dbcp2.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) throws SQLException {
		String[] conf = {"springmvc-servlet.xml","applicationContext.xml","spring-mybatis.xml"};
		ApplicationContext ap = new ClassPathXmlApplicationContext(conf);
		System.out.println(ap);
		BasicDataSource dbcp = ap.getBean("dbcp", BasicDataSource.class);
		System.out.println(dbcp);
		System.out.println(dbcp.getConnection());
		SqlSessionFactory session = ap.getBean("sqlSession", SqlSessionFactory.class);
		System.out.println(session);
	}
}
