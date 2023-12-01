package com.devsuperior.dscatalog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;

@SpringBootApplication
public class DscatalogApplication {

	public static void main(String[] args) {
		SpringApplication.run(DscatalogApplication.class, args);
	}
	
	
}
