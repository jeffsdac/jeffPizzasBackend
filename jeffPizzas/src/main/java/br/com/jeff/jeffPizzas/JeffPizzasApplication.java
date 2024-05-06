package br.com.jeff.jeffPizzas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import java.util.List;

import br.com.jeff.jeffPizzas.Models.DrinksOrder;
import br.com.jeff.jeffPizzas.Service.DrinksOrderService;


@SpringBootApplication
public class JeffPizzasApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(JeffPizzasApplication.class, args);

		DrinksOrderService service = context.getBean(DrinksOrderService.class);

		List<DrinksOrder> drinks = service.getAllDrinks();

		for (DrinksOrder drink : drinks){
			System.out.println(drink);
		}

	}

}
