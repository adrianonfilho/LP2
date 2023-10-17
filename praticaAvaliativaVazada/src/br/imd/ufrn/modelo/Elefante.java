package br.imd.ufrn.modelo;

public class Elefante extends Animal{
    private int tamanhoTromba;

    public int getTamanhoTromba() {
        return tamanhoTromba;
    }

    public void setTamanhoTromba(int tamanhoTromba) {
        this.tamanhoTromba = tamanhoTromba;
    }

    @Override
    public void comer() {
        setAliementado(true);
        double quantidade = getPeso() * 0.15;
        setQuantidadeAlimento(quantidade);
    }
}
