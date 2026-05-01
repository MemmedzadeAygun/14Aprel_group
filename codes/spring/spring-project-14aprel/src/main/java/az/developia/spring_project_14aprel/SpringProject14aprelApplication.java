package az.developia.spring_project_14aprel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import az.developia.spring_project_14aprel.entity.Student;


@SpringBootApplication
public class SpringProject14aprelApplication {
	//auto config
	//component scan
	//config
	
	public static void main(String[] args) {
		
	ConfigurableApplicationContext run = SpringApplication.run(SpringProject14aprelApplication.class, args);
		
		//bean
		Student bean = run.getBean(Student.class);
//		bean.getId();
//		bean.getName();
		System.out.println(bean);
		
		String[] beanDefinitionNames = run.getBeanDefinitionNames();
		for (String name : beanDefinitionNames) {
			System.out.println(name);
		}
		
		
		System.out.println("Hello World!");
	}

}
