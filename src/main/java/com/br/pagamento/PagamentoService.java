package com.br.pagamento;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class PagamentoService {
    private static int count = 1;
    private Logger log = LoggerFactory.getLogger(PagamentoService.class);

    public PagamentoResponse efetuaPagamento(Pagamento pagamento) {

        log.info("Tentando efetuar o pagamento do usuario #{} via #{} no valor de #{}",
                pagamento.getCpf(), pagamento.getMetodo(), pagamento.getValor());

        boolean conseguiuPagar = count % 2 == 0;
        count++;

        log.info("Concluido tentativa de pagamento");

        return new PagamentoResponse(pagamento.getMetodo(), conseguiuPagar);
    }
}
