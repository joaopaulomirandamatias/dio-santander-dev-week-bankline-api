package com.mirandas.dio.santander.banklineapi.repository;

import javax.persistence.Id;

import com.mirandas.dio.santander.banklineapi.model.Correntista;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CorrentistaRepository extends JpaRepository<Correntista, Id>{
  
}
