package az.developia.spring_project_14aprel.config;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MyTask {

	@Scheduled(initialDelay = 3000, fixedDelay = 5000, zone = "Asia/Baku")
	public void runTask() {
		System.out.println("Task isledi...");
	}
	
}
