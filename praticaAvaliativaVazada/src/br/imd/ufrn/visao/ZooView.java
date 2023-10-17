package br.imd.ufrn.visao;

import br.imd.ufrn.dao.Repositorio;
import br.imd.ufrn.modelo.Animal;
import br.imd.ufrn.modelo.Elefante;
import br.imd.ufrn.modelo.Tigre;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ZooView {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date dt = new Date();

        Repositorio repositorio = new Repositorio();

        Tigre tigre1 = new Tigre();
        tigre1.setNome("Simba");
        tigre1.setPeso(350);
        tigre1.setTipoTigre("Bengala");
        tigre1.setAlimentacao("Carne");
        dt = formato.parse("12/12/2012");
        tigre1.setDataNascimento(dt);
        tigre1.setAliementado(false);

        repositorio.adicionarAnimal(tigre1);

        Tigre tigre2 = new Tigre();
        tigre2.setNome("Rajah");
        tigre2.setPeso(300);
        tigre2.setTipoTigre("Siberiano");
        tigre2.setAlimentacao("Carne");
        dt = formato.parse("12/12/2013");
        tigre2.setDataNascimento(dt);
        tigre2.setAliementado(false);

        repositorio.adicionarAnimal(tigre2);

        Tigre tigre3 = new Tigre();
        tigre3.setNome("Shere Khan");
        tigre3.setPeso(400);
        tigre3.setTipoTigre("Bengala");
        tigre3.setAlimentacao("Carne");
        dt = formato.parse("12/12/2014");
        tigre3.setDataNascimento(dt);
        tigre3.setAliementado(false);

        repositorio.adicionarAnimal(tigre3);

        repositorio.listarAnimais();
        repositorio.alimentarAnimais();
        repositorio.calculaAlimento();
        repositorio.checkConsulta();
        repositorio.encontrarAnimaisMaisVelhosENovos();
    }
}
