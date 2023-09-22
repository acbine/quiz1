package edu.mit.logic;

import org.junit.Test;

import lombok.extern.log4j.Log4j;
@Log4j
public class TestMyLogic2 {
	
	MyLogic2 logic2 =new MyLogic2(); // 새로운 객체를 생성한것

	@Test
	public void TestaddUP() {
		log.info(logic2.addUP(1, 10));
	}
	
	@Test
	public void TestevenAddUp () {
		log.info(logic2.evenAddUp(1, 10));
	}

}
