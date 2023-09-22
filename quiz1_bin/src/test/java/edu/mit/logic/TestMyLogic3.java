package edu.mit.logic;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import lombok.extern.log4j.Log4j;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml") //스프링과 관련된 정보
@Log4j
public class TestMyLogic3 {
	
	@Autowired // 주입하는 어노테이션
	MyLogic3 logic3;

	@Test
	public void TestaddUP() {
		log.info(logic3.addUP(1, 10));
	}
	
	@Test
	public void TestevenAddUp () {
		log.info("--------"+logic3.evenAddUp(1, 10));
	}

}
