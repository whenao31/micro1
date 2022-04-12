package com.example.demo.service;

import com.example.demo.domain.Usuario;
import reactor.core.publisher.Mono;

public interface UsuarioService {
    Mono<Usuario> save(Usuario usuario);
}