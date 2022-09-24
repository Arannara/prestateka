package com.proyecto.Prestateka.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.Prestateka.entidades.Clientes;

public interface UsuarioRepo extends JpaRepository<Clientes, Integer> {

}
