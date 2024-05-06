package br.com.jeff.jeffPizzas.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "T_PIZZAS_DRINKS_ORDERS")
public class DrinksOrder {
    @Id
    private int id;

    private boolean isDelivered;
    
    private float descont;

    private float totalPrice;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idClient")
    private int idClient;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idPizza")
    private int idPizza;
}
