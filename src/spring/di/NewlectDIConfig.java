package spring.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;

@ComponentScan("spring.di.ui")
@Configuration
public class NewlectDIConfig {
	
	//스프링이 호출
	@Bean
	public Exam exam() {
		//IOC컨테이너에 담음
		return new NewlecExam();
	}
}
