package br.com.jeff.jeffPizzas.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.jeff.jeffPizzas.Models.PizzasOrder;

public interface PizzasOrderRepository extends JpaRepository<PizzasOrder, Integer>{
    
}
