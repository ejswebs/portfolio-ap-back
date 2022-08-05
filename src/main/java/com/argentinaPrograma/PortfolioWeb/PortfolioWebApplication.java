package com.argentinaPrograma.PortfolioWeb;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@Getter
@Setter
@RestController
@RequestMapping("/api")
public class PortfolioWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(PortfolioWebApplication.class, args);
	}

}
