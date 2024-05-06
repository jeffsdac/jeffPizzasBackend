package br.com.jeff.jeffPizzas.Service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.jeff.jeffPizzas.Models.Client;

@Repository
public interface ClientDb extends JpaRepository<Client, Integer>{
    
}
