package az.developia.spring_project_14aprel.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "app")
public class AppProperties {

	private String author;
	
	private boolean active;

	
	public String getAuthor() {
		return author;
	}



	public void setAuthor(String author) {
		this.author = author;
	}



	public boolean isActive() {
		return active;
	}



	public void setActive(boolean active) {
		this.active = active;
	}



	public void showProperties() {
		System.out.println(author);
		System.out.println(active);
	}
	
	
}
