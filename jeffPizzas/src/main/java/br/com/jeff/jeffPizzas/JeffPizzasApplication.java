package br.com.jeff.jeffPizzas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import br.com.jeff.jeffPizzas.Models.Client;

import br.com.jeff.jeffPizzas.Service.ClientService;



@SpringBootApplication
public class JeffPizzasApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(JeffPizzasApplication.class, args);

		ClientService service = context.getBean(ClientService.class);

		Client cliente = service.getByEmail("JEF@JEF.COM.BR");

		System.out.println(cliente);

	}

}
