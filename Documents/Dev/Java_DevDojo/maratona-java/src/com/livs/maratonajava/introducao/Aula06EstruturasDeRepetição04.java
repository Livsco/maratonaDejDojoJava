package com.livs.maratonajava.introducao;

public class Aula06EstruturasDeRepetição04 {
    // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
    // condição valorParcela >= 1000
    public static void main(String[] args) {
        double valorTotal = 30000;
        for (int parcela = 1; parcela <= valorTotal ; parcela++) {
            double valorParcela = valorTotal/parcela;
            if (valorParcela >= 1000) {
                System.out.println("Parcela "+ parcela+ " R$ "+ valorParcela);
            } else {
                break;
            }
        } // Outra possibilidade para redução do código
        // indicar if (valorParcela < 1000) {} break;
        // Dessa forma, sendo a parcela menor que mil, o programa é interrompido
    }
}
