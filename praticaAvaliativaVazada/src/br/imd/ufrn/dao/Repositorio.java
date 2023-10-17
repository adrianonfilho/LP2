package br.imd.ufrn.dao;

import br.imd.ufrn.modelo.Animal;
import br.imd.ufrn.modelo.Elefante;
import br.imd.ufrn.modelo.Girafa;
import br.imd.ufrn.modelo.Tigre;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Repositorio {
    private ArrayList<Animal> animais;

    public Repositorio() {
        animais = new ArrayList<>();
    }

    public void adicionarAnimal(Animal animal){
        animais.add(animal);
    }

    public void removerAnimal(Animal animal){
        animais.remove(animal);
    }

    public void listarAnimais(){
        for (Animal animal : animais) {
            System.out.println("Nome: " + animal.getNome() + "     Alimentacao: " + animal.getAlimentacao());
            System.out.println("Peso: " + animal.getPeso() + "     Idade: " + animal.calcularIdade() + " Alimentado: " + animal.isAliementado());
            System.out.println("*********************************");
        }
    }

    public void calculaAlimento(){
        double totalAlimento = 0;
        double herbivoro = 0;
        double carnivoro = 0;
        for (Animal animal : animais){
            if (animal.isAliementado()){
                System.out.println("*********************************");
                System.out.println("Animal " + animal.getNome() + " se alimentou de " + animal.getQuantidadeAlimento() + " quilos");
                totalAlimento += animal.getQuantidadeAlimento();
                if (animal.getAlimentacao().equals("Verduras e Frutas")){
                    herbivoro += animal.getQuantidadeAlimento();
            }
                else if (animal.getAlimentacao().equals("Carne")){
                    carnivoro += animal.getQuantidadeAlimento();
                }
            }
        }
        System.out.println("*********************************");
        System.out.println("Total de alimento usado: " + totalAlimento);
        System.out.println("Frutas e Legumes: " + herbivoro);
        System.out.println("Carne: " + carnivoro);
        System.out.println("*********************************");
    }

    public void checkConsulta(){
        System.out.println("************** Consultas Animais *******************");
        for (Animal animal : animais){
            if (animal instanceof Elefante){
                if (animal.calcularIdade() % 7 == 0){
                    System.out.println("Elefante -" + animal.getNome() + " foi consultado!!!");
                }
            }
            if (animal instanceof Girafa){
                if (animal.calcularIdade() % 5 == 0){
                    System.out.println("Girafa -" + animal.getNome() + " foi consultado!!!");
                }
            }
            if (animal instanceof Tigre){
                if (animal.calcularIdade() % 3 == 0){
                    System.out.println("Tigre -" + animal.getNome() + " foi consultado!!!");
                }
            }
        }
        System.out.println("*********************************");
    }

    public void alimentarAnimais(){
        for (Animal animal : animais){
            animal.comer();
        }
    }

    public void encontrarAnimaisMaisVelhosENovos() {
        Map<String, Animal> maisVelhos = new HashMap<>();
        Map<String, Animal> maisNovos = new HashMap();

        for (Animal animal : animais) {
            String especie = animal.getClass().getSimpleName();

            if (!maisVelhos.containsKey(especie) || animal.calcularIdade() < maisVelhos.get(especie).calcularIdade()) {
                maisVelhos.put(especie, animal);
            }

            if (!maisNovos.containsKey(especie) || animal.calcularIdade() > maisNovos.get(especie).calcularIdade()) {
                maisNovos.put(especie, animal);
            }
        }

        for (Map.Entry<String, Animal> entry : maisVelhos.entrySet()) {
            System.out.println(entry.getKey() + " com Menor idade eh: " + entry.getValue().getNome() + " [" + entry.getValue().calcularIdade() + "]");
        }

        for (Map.Entry<String, Animal> entry : maisNovos.entrySet()) {
            System.out.println(entry.getKey() + " com Maior idade eh: " + entry.getValue().getNome() + " [" + entry.getValue().calcularIdade() + "]");
        }
    }

}
