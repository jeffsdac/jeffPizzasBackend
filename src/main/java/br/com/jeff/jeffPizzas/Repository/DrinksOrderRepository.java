package br.com.jeff.jeffPizzas.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.jeff.jeffPizzas.Models.DrinksOrder;

public interface DrinksOrderRepository extends JpaRepository<DrinksOrder, Integer>{
}
