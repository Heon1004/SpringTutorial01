package spring.aop.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LogAroundAdvice implements MethodInterceptor{

	@Override
	public Object invoke(MethodInvocation invocation) throws Throwable {

		long start = System.currentTimeMillis();
		
		/*
		 	Java에서는 invoke 스프링에서는 proceed
		 	Java에서는 Target을 넘겨줘야했는데 여기서는 외부와 연관되지않음
		 	XML로 결합되는 관계를 다 만들었기때문에 따로 구현하지않아도됨
		 */
		
		Object result = invocation.proceed();
		
		long end = System.currentTimeMillis();
		
		String message = (end - start) + "ms 시간이 걸렸습니다.";
		System.out.println(message);
		
		return result;	}
	
}
