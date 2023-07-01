package com.radike.porfolio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PorfolioApplication {
        public static final String DATASOURCE = System.getenv("DATASOURCE_URL");
		public static final String PASSWORD = System.getenv("DATASOURCE_PASSWORD");
		public static final String USERNAME = System.getenv("DATASOURCE_USERNAME");
	public static void main(String[] args) {
		SpringApplication.run(PorfolioApplication.class, args);
	}

}
