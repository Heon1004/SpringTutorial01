package spring.di.ui;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import spring.di.entity.Exam;

public class InlineExamConsole implements ExamConsole {
	
	/*
	(인젝션은 3가지 setter,constructor,기본생성자)
	Autowired: 자동으로 bean을 찾아서 세팅해줌.
	사용시에는 context:annotation-configが必要
	動作の原理は자료형(Exam)을 찾고 名前で(exam)探す。
	
	required: xml에 객체가없어도 null값으로 진행함.
	
	Qualifier: 複数のbeanがある時idで見つけないため、
	idと一致するもの見つけ出して設定する
*/
	
	@Autowired(required = false)
	@Qualifier("exam1")
	private Exam exam;

	//기본생성자가 생성되면서 Qualifier 인젝션됌.
	public InlineExamConsole() {System.out.println("기본생성자 호출");}
	
	public InlineExamConsole(Exam exam) {
		this.exam = exam;
		System.out.println("overloaded");
	}

	@Override
	public void print() {
		System.out.printf("total is %d, avg is %f\n", exam.total(), exam.avg());

	}

	
	@Override
	public void setExam(Exam exam) {
		System.out.println("setter Method");
		this.exam = exam;

	}
}
