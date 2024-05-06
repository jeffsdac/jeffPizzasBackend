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
@Table(name="T_PIZZAS_PIZZAS")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Pizza {
    
    @Id
    private int id;

    private String name;

    private String description;

    @Column(name="BASEPRICE")
    private double basePrice;
}
