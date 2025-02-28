package br.com.cine.boot.src.model;

public class Cliente extends Pessoa{
    private Long id;
    private String tipoCliente;
    private Double saldoCarteira;

    public Cliente(Double saldoCarteira,String tipoCliente,String nome, int idade, String cpf, String email) {
        super(nome, idade, cpf, email);
        this.saldoCarteira = 0.0;
        this.tipoCliente = tipoCliente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public Double getSaldoCarteira() {
        return saldoCarteira;
    }

    public void setSaldoCarteira(Double saldoCarteira) {
        this.saldoCarteira = saldoCarteira;
    }
}
