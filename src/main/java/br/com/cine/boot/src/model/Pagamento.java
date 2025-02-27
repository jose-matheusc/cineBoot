package br.com.cine.boot.src.model;

public class Pagamento {
    private Long id;
    private TiposPagamento tipoDePagamento;
    private double valor;
    private boolean confirmado;

    public Pagamento(Long id, TiposPagamento tipoDePagamento, double valor, boolean confirmado) {
        this.id = id;
        this.tipoDePagamento = tipoDePagamento;
        this.valor = valor;
        this.confirmado = confirmado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TiposPagamento getTipoDePagamento() {
        return tipoDePagamento;
    }

    public void setTipoDePagamento(TiposPagamento tipoDePagamento) {
        this.tipoDePagamento = tipoDePagamento;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean isConfirmado() {
        return confirmado;
    }

    public void setConfirmado(boolean confirmado) {
        this.confirmado = confirmado;
    }
}
