package az.developia.spring_project_14aprel.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class LogDemo {

	private Logger log = LoggerFactory.getLogger(LogDemo.class);
	
	public void test() {
		log.trace("Butun melumatlar ucun logging");
		log.debug("developer ucun logging");
		log.info("Sistem melumatlari ucun logging");
		log.warn("Xeberadarliq mesajlari ucun logging");
		log.error("Kritik mesajlar ucun logging");
	}
	
	@Before("execution(* import az.developia.spring_project_14aprel.controller.UserController.*(..))")
	public void addBefore(JoinPoint joinPoint) {
		log.info("metod ise dusdu", joinPoint.getSignature().getName());
	}
	
	@After("execution(* import az.developia.spring_project_14aprel.controller.UserController.*(..))")
	public void addAfter(JoinPoint joinPoint) {
		log.info("metod isini bitirdi", joinPoint.getSignature().getName());
	}
}
