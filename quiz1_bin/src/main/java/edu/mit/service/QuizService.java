package edu.mit.service;

import org.springframework.stereotype.Service;

import edu.miit.vo.TwoVO;
import edu.mit.logic.MyLogic3;
import lombok.AllArgsConstructor;
@AllArgsConstructor //생성자주입 생성자를 만들고 
@Service //서비스를 하기위한 어노테이션
public class QuizService {
	
	private MyLogic3 logic;
	public int addUP(TwoVO vo) {		
		return logic.addUP(vo.getNum1(),vo.getNum2());
	}
	
	public int evenAddUp (TwoVO vo) {
		return logic.evenAddUp(vo.getNum1(),vo.getNum2());
	}

}
