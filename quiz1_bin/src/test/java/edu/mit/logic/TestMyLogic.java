package edu.mit.logic;

import org.junit.Test;

import lombok.extern.log4j.Log4j;

@Log4j
public class TestMyLogic {
	
	
	
	@Test
	public void TestaddUP() {
		log.info(MyLogic.addUP(1, 10));
	}
	
	@Test
	public void TestevenAddUp () {
		log.info(MyLogic.evenAddUp(1, 10));
	}

}
