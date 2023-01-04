package kr.co.ch03.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
public class AroundAdvice {
	
	@Pointcut("execution(* kr.co.ch03.AOPService.delete*(..))")
	public void deletePointcut() {}
	@Pointcut("execution(* kr.co.ch03.AOPService.insert*(..))")
	public void insertPointcut() {}
	
	public void around1(ProceedingJoinPoint pjp) throws Throwable{
		
		
		@Around("deletePointcut()")
		System.out.println("횡단관심 - around1 before");
		pjp.proeed();
		System.out.println("횡단관심 - around1 after");
		
		@Around("insertPointcut()")
		System.out.println("횡단관심 - around1 before");
		pjp.proeed();
		System.out.println("횡단관심 - around1 after");
		
	}
	
	
}
