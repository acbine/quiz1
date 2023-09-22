package edu.mit.logic;


import org.springframework.stereotype.Component;

import edu.miit.vo.TwoVO;
import lombok.extern.log4j.Log4j;

@Log4j
@Component // 스프링에서 관리하는 객체라는 의미 -> 스캔해야됨 
public class MyLogic3 {
	
	public  int addUP(int num1 , int num2) {
		int sum=0;
		for(int i=num1; i<=num2; i++) {
			sum=sum+i;			
		}		
		return sum;
	}
	

	public  int evenAddUp(int num1 , int num2) {
		int sum=0;
		for(int i=num1; i<=num2; i++) {
			if(i%2==0) {
				sum=sum+i;	
			}
		}		
		return sum;
	}

}
