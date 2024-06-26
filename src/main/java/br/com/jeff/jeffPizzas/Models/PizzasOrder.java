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
import lombok.ToString;

@Entity
@Table(name = "T_PIZZAS_PIZZAS_ORDERS")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class PizzasOrder {
    @Id
    private int id;

    private boolean isDelivered;

    private float descont;

    private float totalPrice;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="idClient")
    private Client idClient;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="idPizza")
    private Pizza idPizza;
}
