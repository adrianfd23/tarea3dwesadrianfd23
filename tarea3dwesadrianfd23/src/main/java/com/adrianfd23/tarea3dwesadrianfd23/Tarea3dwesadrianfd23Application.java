package com.adrianfd23.tarea3dwesadrianfd23;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Tarea3dwesadrianfd23Application {
	
	@Bean
	public Principal applicationStartupRunner() {
		return new Principal();
	}

	public static void main(String[] args) {
		SpringApplication.run(Tarea3dwesadrianfd23Application.class, args);
	}

}
