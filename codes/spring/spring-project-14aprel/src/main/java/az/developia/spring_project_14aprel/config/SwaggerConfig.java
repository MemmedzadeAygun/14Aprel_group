package az.developia.spring_project_14aprel.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;


@Configuration
public class SwaggerConfig {

	@Bean
	public OpenAPI customOpenApi() {
		return new OpenAPI()
				.info(new Info()
						.title("Book Shopping Project")
						.version("3.1.0")
						.description("Book Project ile bagli API-ler"));
				
	}
}
