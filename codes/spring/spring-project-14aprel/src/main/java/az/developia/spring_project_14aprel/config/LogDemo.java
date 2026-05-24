package az.developia.spring_project_14aprel.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class LogDemo {

	private Logger log = LoggerFactory.getLogger(LogDemo.class);
	
	public void test() {
		log.trace("Butun melumatlar ucun logging");
		log.debug("developer ucun logging");
		log.info("Sistem melumatlari ucun logging");
		log.warn("Xeberadarliq mesajlari ucun logging");
		log.error("Kritik mesajlar ucun logging");
	}
}
