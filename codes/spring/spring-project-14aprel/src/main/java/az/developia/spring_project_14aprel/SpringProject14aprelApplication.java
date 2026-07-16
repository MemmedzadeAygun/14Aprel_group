package az.developia.spring_project_14aprel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.ConfigurableApplicationContext;

import az.developia.spring_project_14aprel.config.AppConfig;
import az.developia.spring_project_14aprel.config.AppProperties;
import az.developia.spring_project_14aprel.config.LogDemo;
import az.developia.spring_project_14aprel.entity.Book;
import az.developia.spring_project_14aprel.entity.Student;


@SpringBootApplication
@EnableCaching
public class SpringProject14aprelApplication {
	//auto config
	//component scan
	//config
	
	public static void main(String[] args) {
		
	ConfigurableApplicationContext run = SpringApplication.run(SpringProject14aprelApplication.class, args);
		
		//bean
//		Student bean = run.getBean(Student.class);
//		Student student = run.getBean("myStudent1", Student.class);
//		System.out.println(student.getComputer().getModel());
//		System.out.println(student.getComputer());
		
//		Student bean2 = run.getBean("myStudent1", Student.class);
//		Student bean3 = run.getBean("myStudent1", Student.class);
//		bean.getId();
//		bean.getName();
//		System.out.println(student);
		        
	
//	AppConfig bean = run.getBean(AppConfig.class);
	AppProperties bean = run.getBean(AppProperties.class);
	bean.showProperties();
	
	LogDemo bean2 = run.getBean(LogDemo.class);
	bean2.test();
	
//	Book bean3 = run.getBean(Book.class);
//	bean3.builder()
//	.build()
//	.setName("Eli");

	        
//		
//		String[] beanDefinitionNames = run.getBeanDefinitionNames();
//		for (String name : beanDefinitionNames) {
//			System.out.println(name);
//		}
//		
//		
//		System.out.println("Hello World!");
	}

}
