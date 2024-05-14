package br.com.jeff.jeffPizzas.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.jeff.jeffPizzas.Models.PizzasOrder;

import java.util.List;

@Component
public class PizzasOrderService {
    @Autowired
    PizzasOrderDb db;

    public List<PizzasOrder> getAllPizzasOrders(){
        return db.findAll();
    }
}
