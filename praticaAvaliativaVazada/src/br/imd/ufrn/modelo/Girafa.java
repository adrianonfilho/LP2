package br.imd.ufrn.modelo;

public class Girafa extends Animal{
    private int tamanhoLingua;

    public int getTamanhoLingua() {
        return tamanhoLingua;
    }

    public void setTamanhoLingua(int tamanhoLingua) {
        this.tamanhoLingua = tamanhoLingua;
    }

    @Override
    public void comer() {
        setAliementado(true);
        double quantidade = getPeso() * 0.1;
        setQuantidadeAlimento(quantidade);
    }
}
