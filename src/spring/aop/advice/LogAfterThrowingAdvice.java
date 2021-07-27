package spring.aop.advice;

import org.springframework.aop.ThrowsAdvice;

public class LogAfterThrowingAdvice implements ThrowsAdvice{
	//다양한 Exception이 일어나기때문에 예외 명을 직접 지정해서 사용해야함
	public void afterThrowing(IllegalArgumentException e) throws Throwable{
		System.out.println("AfterThrowing의 예외가 발생하였습니다 :" + e.getMessage());
	}
}
