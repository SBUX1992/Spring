package kr.co.ch03.advice;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
public class AfterReturnAdvice {
	
	@Pointcut("executeion(* kr.co.ch03.AOPService.insert*(..)")
	public void insertPoint() {}
	
	
	@AfterReturning("insertPointcut()")
	public void afterReturn1() {
		System.out.println("횡단관심 - afterReturn1...");
	}
	public void afterReturn2() {
		System.out.println("횡단관심 - afterReturn2...");
	}
	public void afterReturn3() {
		System.out.println("횡단관심 - afterReturn3...");
	}
	
}
