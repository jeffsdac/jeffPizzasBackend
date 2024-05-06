package br.com.jeff.jeffPizzas.Service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.jeff.jeffPizzas.Models.DrinksOrder;

@Repository
public interface DrinksOrderDb extends JpaRepository<DrinksOrder, Integer>{
    
}
