package edu.mit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class QuizController {
	
	@GetMapping("/quiz/quiz1")
	void quiz1(Model model) {
		model.addAttribute("quiz","오늘은 금요일");
		
		
	}

}
