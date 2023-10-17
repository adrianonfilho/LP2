package br.imd.ufrn.modelo;

import java.util.Date;

public abstract class Animal {
    protected String nome;
    protected Date dataNascimento;
    protected int peso;
    protected boolean aliementado;
    protected String alimentacao;
    protected double quantidadeAlimento;

    abstract public void comer();

    public int calcularIdade(){
        Date dataAtual = new Date();
        int anoNascimento = dataNascimento.getYear();
        int anoAtual = dataAtual.getYear();

        int idade = anoAtual - anoNascimento;

        return idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public boolean isAliementado() {
        return aliementado;
    }

    public void setAliementado(boolean aliementado) {
        this.aliementado = aliementado;
    }

    public String getAlimentacao() {
        return alimentacao;
    }

    public void setAlimentacao(String alimentacao) {
        this.alimentacao = alimentacao;
    }

    public double getQuantidadeAlimento() {
        return quantidadeAlimento;
    }

    public void setQuantidadeAlimento(double quantidadeAlimento) {
        this.quantidadeAlimento = quantidadeAlimento;
    }
}
