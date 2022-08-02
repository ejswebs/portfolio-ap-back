package com.argentinaPrograma.PortfolioWeb;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Getter
@Setter
public class PortfolioWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(PortfolioWebApplication.class, args);
	}

}
