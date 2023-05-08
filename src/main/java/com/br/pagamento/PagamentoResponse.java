package com.br.pagamento;

public class PagamentoResponse {
    private Metodo metodo;
    private boolean efetuado;

    public PagamentoResponse(Metodo metodo, boolean efetuado) {
        this.metodo = metodo;
        this.efetuado = efetuado;
    }

    public Metodo getMetodo() {
        return metodo;
    }

    public boolean isEfetuado() {
        return efetuado;
    }
}
