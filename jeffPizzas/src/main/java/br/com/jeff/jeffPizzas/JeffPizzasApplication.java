package br.com.jeff.jeffPizzas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class JeffPizzasApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(JeffPizzasApplication.class, args);
	}

}
