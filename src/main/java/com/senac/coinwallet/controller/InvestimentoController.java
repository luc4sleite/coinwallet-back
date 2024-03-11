package com.senac.coinwallet.controller;

import com.senac.coinwallet.domain.Investimento;
import com.senac.coinwallet.service.InvestimentoService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/investimento")
public class InvestimentoController {

    @Autowired
    private InvestimentoService investimentoService;

    @GetMapping("/all")
    public ResponseEntity<List<Investimento>> findAll() {
        return ResponseEntity.ok(investimentoService.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Investimento> findById(@PathVariable Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(investimentoService.findById(id));
    }

    @GetMapping("/rendaVariavel")
    public ResponseEntity<List<Investimento>> findByTipo() {
        return ResponseEntity.status(HttpStatus.OK).body(investimentoService.findByTipo(2));
    }

    @GetMapping("/rendaFixa")
    public ResponseEntity<List<Investimento>> findByTipo2() {
        return ResponseEntity.status(HttpStatus.OK).body(investimentoService.findByTipo(1));
    }

    @PostMapping("/add")
    public ResponseEntity<Investimento> save(@RequestBody Investimento investimento) {
        Investimento novoInvestimento = investimentoService.save(investimento);
        if (novoInvestimento != null) {
            return ResponseEntity.status(HttpStatus.CREATED).body(novoInvestimento);
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        investimentoService.delete(id);
        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Investimento> update(@PathVariable Long id, @RequestBody Investimento investimento) {
        investimento.setId(id);
        return ResponseEntity.status(HttpStatus.OK).body(investimentoService.update(investimento));
    }
}
