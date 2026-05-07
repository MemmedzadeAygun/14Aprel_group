package az.developia.spring_project_14aprel.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import az.developia.spring_project_14aprel.entity.Computer;
import az.developia.spring_project_14aprel.entity.Student;

@Configuration
public class MyConfig {
	
	@Bean
	public Student myStudent2() {  //myStudent2
		Student s = new Student();
		s.setId(2);
		s.setName("Vuqar");
		s.setSurname("Rustemli");
		return s;
	}
	
	@Bean
//	@Primary
	public Computer myComp2() { 		//myComp2
		Computer c = new Computer();
		c.setId(4);
		c.setModel("g65");
		return c;
	}

}
