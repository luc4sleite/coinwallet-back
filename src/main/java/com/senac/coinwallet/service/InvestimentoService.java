package com.senac.coinwallet.service;

import com.senac.coinwallet.domain.Investimento;
import com.senac.coinwallet.repository.InvestimentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InvestimentoService {

    @Autowired
    private InvestimentoRepository investimentoRepository;

    public Investimento save(Investimento investimento) {
        System.out.println("SALVANDO INVESTIMENTO NO BANCO DE DADOS...");
        investimentoRepository.save(investimento);
        return investimento;
    }

    public void delete(Long id) {
        System.out.println("DELETANDO INVESTIMENTO NO BANCO DE DADOS...");
        investimentoRepository.deleteById(id);
    }

    public Investimento findById(Long id) {
        System.out.println("BUSCANDO INVESTIMENTO NO BANCO DE DADOS...");
        Optional<Investimento> investimento = investimentoRepository.findById(id);
        if (investimento.isPresent()) {
            return investimento.get();
        }
        throw new RuntimeException("Investimento não encontrado");
    }

    public List<Investimento> findAll() {
        System.out.println("BUSCANDO INVESTIMENTOS NO BANCO DE DADOS...");
        return investimentoRepository.findAll();
    }

    public Investimento update(Investimento investimento) {
        System.out.println("ATUALIZANDO INVESTIMENTO NO BANCO DE DADOS...");
        return investimentoRepository.save(investimento);
    }

    public List<Investimento> findByTipo(Integer tipo) {
        System.out.println("BUSCANDO INVESTIMENTOS POR TIPO NO BANCO DE DADOS...");
        return investimentoRepository.findByTipo(tipo);
    }


}
