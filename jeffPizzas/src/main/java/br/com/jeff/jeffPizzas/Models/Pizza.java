package br.com.jeff.jeffPizzas.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="T_PIZZAS_PIZZAS")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Pizza {
    
    @Id
    private int id;

    private String name;

    private String description;

    private double basePrice;
}
