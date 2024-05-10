package br.com.jeff.jeffPizzas.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.jeff.jeffPizzas.Models.Client;

public interface ClientRepository extends JpaRepository<Client, Integer>{
    public Client findByEmail(String email);
}
