package br.com.jeff.jeffPizzas.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.jeff.jeffPizzas.Models.DrinksOrder;

import java.util.List;

@Component
public class DrinksOrderService {
    @Autowired
    DrinksOrderDb db;

    public List<DrinksOrder> getAllDrinks(){
        return db.findAll();
    }
}
