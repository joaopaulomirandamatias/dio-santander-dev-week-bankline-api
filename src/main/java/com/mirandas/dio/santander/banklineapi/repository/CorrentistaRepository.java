package com.mirandas.dio.santander.banklineapi.repository;

import java.util.Optional;

import javax.persistence.Id;

import com.mirandas.dio.santander.banklineapi.model.Correntista;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CorrentistaRepository extends JpaRepository<Correntista, Id>{

  Optional<Correntista> findById(Integer idConta);
  
}
