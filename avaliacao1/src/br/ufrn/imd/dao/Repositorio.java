package br.ufrn.imd.dao;

import java.util.ArrayList;

import br.ufrn.imd.modelo.Carro;
import br.ufrn.imd.modelo.Moto;
import br.ufrn.imd.modelo.Veiculo;

public class Repositorio {
    private ArrayList<Veiculo> veiculos;

    public ArrayList<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(ArrayList<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    public Repositorio(){
        veiculos = new ArrayList<Veiculo>();
    }

    public void addVeiculo(Veiculo v){
        veiculos.add(v);
    }

    public void exibirVeiculosAlugados(){
        double alugueltotal;
        alugueltotal = 0;
        System.out.println("============Alugados============");
        for (Veiculo v : veiculos) {
            if (v.isAlugado()) {
                if (v instanceof Carro) {
                    System.out.println("Carro: " + v.getMarca() + " " + "Placa: " + v.getPlaca() + " " + "Motor: " + ((Carro)v).getPotencia() + " " + "Portas: " + ((Carro)v).getPortas());
                } else if (v instanceof Moto) {
                    System.out.println("Moto: " + v.getMarca() + " " + "Placa: " + v.getPlaca() + " " + "Partida: " + ((Moto)v).getPartida() + " " + ": " + ((Moto)v).getCilindradas());
                }
                alugueltotal = alugueltotal + v.getValorAluguel();
            }
        }
        System.out.println("Valor total dos alugueis: " + alugueltotal);
        System.out.println("============Fim============");
    }

    public void manutencaoVeiculos(){
        double totalOleo;
        totalOleo = 0;
        System.out.println("============Manutenção============");
        for (Veiculo v : veiculos){
            if (v instanceof Carro){
                if ((v.getQuilometragem() % 7000) == 0){
                    System.out.println("Veículo " + v.getMarca() + " trocou oleo");
                    totalOleo = totalOleo + 3.5;
                }
            }
            else if (v instanceof Moto){
                if ((v.getQuilometragem() % 3500) == 0){
                    System.out.println("Veículo " + v.getMarca() + " trocou oleo");
                    totalOleo = totalOleo + 1.5;
                }
            }
        }
        System.out.println("Quantidade total de litros de oleo: " + totalOleo);
        System.out.println("============Fim============");
    }

    public void veiculosDisponiveis(){
        System.out.println("============Disponiveis============");
        for (Veiculo v : veiculos) {
            if (v.isAlugado() == false) {
                if (v instanceof Carro) {
                    System.out.println("Carro: " + v.getMarca() + " " + "Placa: " + v.getPlaca() + " " + "Motor: " + ((Carro)v).getPotencia() + " " + "Portas: " + ((Carro)v).getPortas() + " " + "Valor Aluguel: " + v.getValorAluguel());
                } else if (v instanceof Moto) {
                    System.out.println("Moto: " + v.getMarca() + " " + "Placa: " + v.getPlaca() + " " + "Partida: " + ((Moto)v).getPartida() + " " + "Cilindradas: " + ((Moto)v).getCilindradas() + " " + "Valor Aluguel: " + v.getValorAluguel());
                }
            }
        }
        System.out.println("============Fim============");
    }

    public void listaVeiculos(){
        System.out.println("Lista de veiculos:");
        for (Veiculo v : veiculos){
            System.out.println("Veiculo: " + v.getClass() + "       Marca: " + v.getMarca() + " Placa: " + v.getPlaca());
        }
    }
}
