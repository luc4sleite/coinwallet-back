package com.senac.coinwallet.repository;

import com.senac.coinwallet.domain.Investimento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InvestimentoRepository extends JpaRepository<Investimento, Long> {
    List<Investimento> findByTipo(Integer tipo);
}
