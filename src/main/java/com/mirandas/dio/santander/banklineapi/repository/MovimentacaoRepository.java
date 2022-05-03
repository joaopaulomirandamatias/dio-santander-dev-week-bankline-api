package com.mirandas.dio.santander.banklineapi.repository;

import com.mirandas.dio.santander.banklineapi.model.Movimentacao;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MovimentacaoRepository extends JpaRepository<Movimentacao, Integer> {
  
}
