package br.com.jeff.jeffPizzas.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import br.com.jeff.jeffPizzas.DTO.LoginDto;
import br.com.jeff.jeffPizzas.DTO.RegisterDto;
import br.com.jeff.jeffPizzas.DTO.UserReturn;
import br.com.jeff.jeffPizzas.Models.Client;
import br.com.jeff.jeffPizzas.Repository.ClientRepository;

@RestController
@RequestMapping("/api/client")
@CrossOrigin("*")
public class ClientController {
    
    @Autowired
    ClientRepository repository;

    BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    @PostMapping("/login")
    public ResponseEntity<UserReturn> login(@RequestBody LoginDto dto){
        Client c = repository.findByEmail(dto.email());
        if(encoder.matches(dto.password(), c.getSenha())){
            var retorno = new UserReturn(c.getEmail(),c.getId(), c.getAddress(), c.getCellphone(), c.getRole(), c.getName());
            return ResponseEntity
            .status(HttpStatus.ACCEPTED)
            .body(retorno);
        }
        throw new ResponseStatusException(HttpStatus.UNAUTHORIZED);
    }

    @PostMapping("/register")
    @CrossOrigin("*")
    public ResponseEntity<LoginDto> register (@RequestBody RegisterDto dto){
        if (this.repository.findByEmail(dto.getEmail()) != null) return ResponseEntity.badRequest().build();
        String ecrypitedString = encoder.encode(dto.getPassword());
        dto.setPassword(ecrypitedString);
        Client user = new Client(dto);
        this.repository.save(user);
        return ResponseEntity.status(HttpStatus.CREATED).body(new LoginDto(user.getEmail(), user.getSenha()));
    }
}
