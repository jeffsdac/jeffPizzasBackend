package br.com.jeff.jeffPizzas.Models;

import br.com.jeff.jeffPizzas.DTO.RegisterDto;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String address;

    private String cellphone;

    private String role;

    @Column(name = "is_active")
    private boolean isActive;

    private String email;

    private String senha;

    public Client(RegisterDto dto){
        //String nome, String address, String cellphone, String email, String password
        this.role = "USER";
        this.isActive = true;
        this.name = dto.getNome();
        this.address = dto.getAddress();
        this.cellphone = dto.getCellphone();
        this.email = dto.getEmail();
        this.senha = dto.getPassword();
    }

}
