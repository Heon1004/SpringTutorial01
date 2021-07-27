package spring.aop.advice;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class LogAfterReturningAdvice implements AfterReturningAdvice{

	//함수가 호출되고나서 반환값으로 무언가를 함 그러므로 메소드에 들어가는 값들이 실행결과의 값으로 들어감
	
	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		
		System.out.println("returnValue : " + returnValue + ", method : " + method.getName());
	}

}
