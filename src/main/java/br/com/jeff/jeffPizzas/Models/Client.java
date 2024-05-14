package br.com.jeff.jeffPizzas.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Table(name="T_PIZZAS_CLIENTS")
public class Client {
    
    @Id
    private int id;

    private String name;

    private String address;

    private String cellphone;

    private String role;

    @Column(name = "is_active")
    private boolean isActive;

    private String email;

    private String senha;
}
