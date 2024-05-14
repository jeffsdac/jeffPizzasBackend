package br.com.jeff.jeffPizzas.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.jeff.jeffPizzas.Models.Pizza;

public interface PizzaRepository extends JpaRepository<Pizza, Integer>{
    
}
