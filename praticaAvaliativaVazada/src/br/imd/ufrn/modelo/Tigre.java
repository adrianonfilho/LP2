package br.imd.ufrn.modelo;

public class Tigre extends Animal{
    private String tipoTigre;

    public String getTipoTigre() {
        return tipoTigre;
    }

    public void setTipoTigre(String tipoTigre) {
        this.tipoTigre = tipoTigre;
    }

    @Override
    public void comer() {
        setAliementado(true);
        double quantidade = getPeso() * 0.04;
        setQuantidadeAlimento(quantidade);
    }
}
