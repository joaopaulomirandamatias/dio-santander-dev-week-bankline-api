package com.mirandas.dio.santander.banklineapi.service;

import java.util.Date;

import com.mirandas.dio.santander.banklineapi.dto.NovoCorrentista;
import com.mirandas.dio.santander.banklineapi.model.Conta;
import com.mirandas.dio.santander.banklineapi.model.Correntista;
import com.mirandas.dio.santander.banklineapi.repository.CorrentistaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CorrentistaService {

  @Autowired
  private CorrentistaRepository repository;

  public void save(NovoCorrentista novoCorrentista) {
      Correntista correntista = new Correntista();
      correntista.setNome(novoCorrentista.getNome());
      correntista.setCpf(novoCorrentista.getCpf());

      Conta conta = new Conta();
      conta.setSaldo(0.0);
      conta.setNumero(new Date().getTime());


      correntista.setConta(conta);
      repository.save(correntista);
  }
  
}
