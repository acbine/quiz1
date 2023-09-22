package edu.mit.persistance;

import java.sql.SQLException;

import javax.sql.DataSource;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;
@Log4j
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class DataSourceTest {
	
	@Autowired
	private DataSource dataSource;
	
	
	
	@Test
	public void Testconnection() throws SQLException {
		dataSource.getConnection();
		log.info("hikariConfig를 dataSource에 자동주입 DB연결 테스트");
	}
	
	
	

}
