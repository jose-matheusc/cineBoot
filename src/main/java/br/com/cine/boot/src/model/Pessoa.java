package br.com.cine.boot.src.model;

public class Pessoa {
    private String nome;
    private int idade;
    private int CPF;
    private String email;

    public Pessoa(String nome, int idade, int CPF, String email) {
        this.nome = nome;
        this.idade = idade;
        this.CPF = CPF;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getCPF() {
        return CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
