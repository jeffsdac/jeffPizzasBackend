package br.com.jeff.jeffPizzas.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.jeff.jeffPizzas.Models.Pizza;

import java.util.List;

@Component
public class PizzaService {
    @Autowired
    PizzaDb db;

    public List<Pizza> getAllPizzas(){
        return db.findAll();
    }

}
