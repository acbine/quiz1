package edu.mit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import edu.miit.vo.TwoVO;
import lombok.extern.log4j.Log4j;

@Controller
@Log4j
public class QuizController {
	
	@GetMapping("/quiz/quiz1")
	void quiz1(Model model) {
		model.addAttribute("quiz","오늘은 금요일");
		
		
	}
	
	@GetMapping("/quiz/quiz2")
	void quiz2 () { //입력화면 열어줌
		
	}
/*	@PostMapping("/quiz/quiz2")
	void quiz2post(int num1, int num2 ,Model model) { //전송화면닥고 숫자수집하고 TwoVO에 넣어야지
		log.info("post 요청받음");
		TwoVO vo= new TwoVO();
		vo.setNum1(num1);
		vo.setNum2(num2);
		log.info("------수집된되고 세팅된num1-------"+vo.getNum1()+"-------수집되고 세팅된num2------"+vo.getNum2());
		
		
	}
*/	
	@PostMapping("/quiz/quiz2")
	void quiz2post(TwoVO vo) { //vo 개체를 사용해 vo의 num과 named의 넘이 같아야수집 //이렇게도가능
		log.info("post 요청받음");
		log.info("------수집된되고 ------"+vo);
		
		
	}

}
