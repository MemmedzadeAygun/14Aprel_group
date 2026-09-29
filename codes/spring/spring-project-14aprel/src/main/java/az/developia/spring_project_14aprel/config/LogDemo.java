package az.developia.spring_project_14aprel.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
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
	
	@Pointcut("execution(* az.developia.spring_project_14aprel.controller.UserController.*(..))")
	public void addUserController() {}
	
//	@Before("addUserController()")
//	public void addBefore(JoinPoint joinPoint) {
//		log.info("metod ise dusdu: {}", joinPoint.getSignature().getName());
//	}
//	
//	@After("addUserController()")
//	public void addAfter(JoinPoint joinPoint) {
//		log.info("metod isini bitirdi: {}", joinPoint.getSignature().getName());
//	}
	
	@Around("addUserController()")
	public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
		
		long start = System.currentTimeMillis();
		
		log.info("BEFORE");
		
		
		Object proceed = joinPoint.proceed();
		
		log.info("AFTER");
		
		long end = System.currentTimeMillis();
		
		log.info("metod {} isini bitirdi: {} ms", joinPoint.getSignature().getName(), (end -start));
		
		return proceed;
	}
	
	@AfterThrowing(value = "addUserController()", throwing = "exc")
	public void afterThrowing(ProceedingJoinPoint joinPoint, Exception exc) {
		log.info("Exception bas verdi {} message: {}", joinPoint.getSignature().getName(), exc.getMessage());
	}
	
}
