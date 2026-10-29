package com.example.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.ServerResponse;

import static org.springframework.cloud.gateway.server.mvc.filter.BeforeFilterFunctions.uri;
import static org.springframework.cloud.gateway.server.mvc.filter.Bucket4jFilterFunctions.rateLimit;
import static org.springframework.cloud.gateway.server.mvc.handler.GatewayRouterFunctions.route;
import static org.springframework.cloud.gateway.server.mvc.handler.HandlerFunctions.http;

import java.time.Duration;


@Configuration
public class RouterConfig {

	@Bean
	public RouterFunction<ServerResponse> routerConfig(){
		return route("user-service")
				.GET("/users/**", http())
				.before(uri("http://localhost:8002"))
				.filter(rateLimit(config -> config
						.setCapacity(5)
						.setPeriod(Duration.ofSeconds(1))
						.setKeyResolver(request -> request.servletRequest().getRemoteAddr())
						))
				.build();
	}
}
