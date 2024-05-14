package br.com.jeff.jeffPizzas.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.jeff.jeffPizzas.Models.Drink;

public interface DrinkRepository extends JpaRepository<Drink, Integer>{
    
}
