package spring.aop.advice;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class LogBeforeAdvice implements MethodBeforeAdvice{

	//함수가 호출되기전 실행됨, 실행결과 전
	
	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("LogBeforeAdvice " + method.getName() + ", target is " + target);
	}
	
}
