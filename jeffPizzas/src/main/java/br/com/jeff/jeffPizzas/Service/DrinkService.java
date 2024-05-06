package br.com.jeff.jeffPizzas.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.jeff.jeffPizzas.Models.Drink;

import java.util.List;

@Component
public class DrinkService {
    @Autowired
    DrinkDb db;

    public List<Drink> getAllDrinks(){
        return db.findAll();
    }
}
