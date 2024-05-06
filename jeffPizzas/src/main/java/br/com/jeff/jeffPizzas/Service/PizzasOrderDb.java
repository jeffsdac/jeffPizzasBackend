package br.com.jeff.jeffPizzas.Service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.jeff.jeffPizzas.Models.PizzasOrder;

@Repository
public interface PizzasOrderDb extends JpaRepository<PizzasOrder, Integer>{
}
