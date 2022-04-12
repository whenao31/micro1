package com.example.demo.repository;


import com.example.demo.domain.Usuario;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepo extends ReactiveMongoRepository<Usuario,String> {
}
