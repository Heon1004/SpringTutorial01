package spring.di;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;
import spring.di.ui.ExamConsole;

public class Program {

	public static void main(String[] args) {

		/*
		  스프링에게 지시하는방법으로 코드를 변경 
		  Exam exam = new NewlecExam(); 
		  ExamConsole console = new GridExamConsole();
		 
		 * console.setExam(exam);
		 */
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/di/setting.xml");

		/*
		  ExamConsole console = (ExamConsole) context.getBean("console");
		  xml에bean으로 설정해둔 값을 달라고 getBean요청 이름만가지고오면 어떠한 객체인지 알수없으므로캐스팅을 해줘야함.
		 */
		//Exam이라는 클래스를 가져옴.
		//Exam exam = context.getBean(Exam.class);
		//System.out.println(exam.toString());
		//Examconsole이라는 형식의 class 타입에 맞는 놈을 갖고옴. 만약 인터페이스라면 인터페이스를 가져옴.
		ExamConsole console = context.getBean(ExamConsole.class);
		console.print();
		
		//setting.xml에서 exams라는 이름으로 가져옴
		//List<Exam> exams = (List<Exam>) context.getBean("exams"); //new ArrayList<>()
//		exams.add(new NewlecExam(1,1,1,1));
		
		//for(Exam a: exams) {
		//	System.out.println(a);
		//}
	}

}
