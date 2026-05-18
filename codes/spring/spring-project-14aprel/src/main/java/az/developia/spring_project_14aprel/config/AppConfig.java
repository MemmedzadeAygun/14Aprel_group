package az.developia.spring_project_14aprel.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AppConfig {

	@Value(value = "${app.author}")
	private String author;
	
	@Value(value = "${app.active}")
	private boolean active;
	
	public void showProperties() {
		System.out.println(author);
		System.out.println(active);
	}
	
	
}
