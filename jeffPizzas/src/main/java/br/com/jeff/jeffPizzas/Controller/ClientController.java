package br.com.jeff.jeffPizzas.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import br.com.jeff.jeffPizzas.DTO.LoginDto;
import br.com.jeff.jeffPizzas.Models.Client;
import br.com.jeff.jeffPizzas.Repository.ClientRepository;

@RestController
@RequestMapping("/api/client")
public class ClientController {
    
    @Autowired
    ClientRepository repository;

    @PostMapping("/login")
    public ResponseEntity<LoginDto> login(@RequestBody LoginDto dto){
        Client c = service.getByEmail(dto.email());
        
        if(c.getSenha().equals(dto.password())){
            var retorno = new LoginDto(c.getEmail(), c.getSenha());
            return ResponseEntity
            .status(HttpStatus.ACCEPTED)
            .body(retorno);
        }
        throw new ResponseStatusException(HttpStatus.UNAUTHORIZED);
    }
}
