package edu.mit.persistance;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

import lombok.extern.log4j.Log4j;

@Log4j
public class Sql_JDBCTest {
	
	@Test
	public void TestConnection() {
		Connection conn;
		try {
			log.info("-------------1---------------");
			Class.forName("com.mysql.cj.jdbc.Driver");
			log.info("--------------2--------------");
			DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/mit","aaa","1234");
			log.info("-------------연결성공---------------");
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	@Test
	public void TESTjunit() {
		log.info("____유닛테스트_____");
	}
	
	

}
