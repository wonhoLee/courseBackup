package me.chap07;

import org.springframework.stereotype.Component;

@Component("calculator")
public class ReCalculator implements Calculator{

	@Override
	public long factorial(long num) {
		if(num == 0) {
			return 1;
		}else {
			return num * factorial(num-1);
		}
	}
	
}
