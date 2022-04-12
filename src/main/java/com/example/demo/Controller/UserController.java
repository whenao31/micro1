package com.example.demo.Controller;

import com.example.demo.domain.Usuario;
import com.example.demo.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@CrossOrigin(origins = "*")
public class UserController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/usuario")
    @ResponseStatus(HttpStatus.CREATED)
    private Mono<Usuario> save(@RequestBody Usuario usuario){return this.usuarioService.save(usuario);}

}