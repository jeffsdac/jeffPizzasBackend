package br.com.jeff.jeffPizzas.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.jeff.jeffPizzas.Models.Client;

import java.util.List;

@Component
public class ClientService {
    @Autowired
    ClientDb db;

    public List<Client> getAll(){
        return db.findAll();
    }
}
