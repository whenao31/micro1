package com.example.demo.service.impl;

import com.example.demo.domain.Usuario;
import com.example.demo.repository.UsuarioRepo;
import com.example.demo.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class UsuarioServiceImpl implements UsuarioService {
    @Autowired
    @Qualifier("user")
    private UsuarioRepo usuarioRepo;

    @Override
    public Mono<Usuario> save(Usuario usuario){return this.usuarioRepo.save(usuario);}
}