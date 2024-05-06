package br.com.jeff.jeffPizzas.Service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import br.com.jeff.jeffPizzas.Models.Drink;

@Service
public interface DrinkDb extends JpaRepository<Drink, Integer>{
    
}
