package spring.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.aop.entity.Exam;
import spring.aop.entity.NewlecExam;
import spring.di.NewlectDIConfig;

public class Program {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("spring/aop/setting.xml");

		Exam exam = (Exam) context.getBean("exam");
		
		System.out.printf("total is %d\n", exam.total());
		System.out.printf("total is %f\n", exam.avg());

		/*
		 * Exam exam = new NewlecExam(1,1,1,1);
		 * 
		 * 
		 * 
		 * Proxy는 가짜라는 의미임 가상의 객체를 만드는것 곁단위 기능을 만듬.
		 * Proxy.newProxyInstance(loader,interfaces,h) loader: 실제업무를 호출하기위해 객체의 정보
		 * interfaces: Exam이라는 정보를 넣어줘야함 (loader에 들어가는 객체가 배열일수도있으므로) Object[] {
		 * 인터페이스이름.Class } h: 곁단위 업무를 꽃을수있는곳.new InvocationHandler() InvocationHandler라는
		 * 인터페이스를 구현하는 클래스를 객체화하기 위해선 별도의 클래스를 만들어야하는데 가상으로 클래스를 작성함.
		 * 
		 * //Object형으로 반환하기때문에 형식에 맞게 형변환 함 Exam proxy =(Exam) Proxy.newProxyInstance(
		 * NewlecExam.class.getClassLoader(), new Class[] {Exam.class}, new
		 * InvocationHandler() {
		 * 
		 * @Override //invoke는 모든 형태의 값을 반환하기위해 Object형으로 반환함 public Object
		 * invoke(Object proxy, Method method, Object[] args) throws Throwable {
		 * 
		 * long start = System.currentTimeMillis();
		 * 
		 * //method를 호출하기 위해 exam을 넣음. //호출하는 메소드가 갖고있는 파라미터(Object[])를 invoke의args로
		 * 전달해줌. Object result = method.invoke(exam, args);
		 * 
		 * try { Thread.sleep(200); } catch (InterruptedException e) {
		 * e.printStackTrace(); }
		 * 
		 * long end = System.currentTimeMillis();
		 * 
		 * String message = (end - start) + "ms 시간이 걸렸습니다.";
		 * System.out.println(message);
		 * 
		 * return result; } } );
		 */

	}

}
