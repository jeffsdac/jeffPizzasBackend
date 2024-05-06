package br.com.jeff.jeffPizzas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import java.util.List;

import br.com.jeff.jeffPizzas.Models.PizzasOrder;
import br.com.jeff.jeffPizzas.Service.PizzasOrderService;

@SpringBootApplication
public class JeffPizzasApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(JeffPizzasApplication.class, args);

		PizzasOrderService service = context.getBean(PizzasOrderService.class);

		

	}

}
