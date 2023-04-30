package com.br.pagamento;

import jakarta.persistence.EntityNotFoundException;
import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pagamentos")
public class PagamentoController {

    private Logger log = LoggerFactory.getLogger(PagamentoController.class);

    @Autowired
    private PagamentoRepository repository;

    @GetMapping
    public ResponseEntity<?> lista() {
        return ResponseEntity.ok(repository.findAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> detalhe(@PathVariable Long id) {
        log.info("Busca pedido com id: " + id);
        return ResponseEntity.ok(
                repository
                        .findById(id)
                        .orElseThrow(() -> new EntityNotFoundException("Não encontrou pedido com id: " + id))
        );
    }

    @Transactional
    @PostMapping
    public ResponseEntity<?> novo(@RequestBody Pagamento pagamento) {
        log.info("Grava novo pedido");
        return ResponseEntity.ok(repository.save(pagamento));
    }
}
