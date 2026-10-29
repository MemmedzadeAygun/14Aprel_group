package com.example.gateway.config;

import java.rmi.server.RemoteServer;
import java.time.Duration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.github.benmanes.caffeine.cache.Caffeine;

import io.github.bucket4j.caffeine.CaffeineProxyManager;
import io.github.bucket4j.distributed.proxy.AsyncProxyManager;

@Configuration
public class RateLimitingConfig {

	@Bean
	public AsyncProxyManager<String> proxyManagerCaffeine(){
		Caffeine<String, RemoteServer> cache =(Caffeine) Caffeine.newBuilder().maximumSize(1000);
		
		return new CaffeineProxyManager(cache, Duration.ofMinutes(1)).asAsync();
	}
}
