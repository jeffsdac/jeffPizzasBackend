package br.com.jeff.jeffPizzas.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.jeff.jeffPizzas.Models.PizzasOrder;

@Repository
public interface PizzasOrderRepository extends JpaRepository<PizzasOrder, Integer>{
    
}
