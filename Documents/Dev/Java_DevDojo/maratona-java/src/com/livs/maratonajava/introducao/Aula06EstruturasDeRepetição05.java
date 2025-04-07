    package com.livs.maratonajava.introducao;

    public class Aula06EstruturasDeRepetição05 {
        public static void main(String[] args) {
            // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
            // condição valorParcela >= 1000
           double valorTotal = 30000;
           for (int parcela = (int) valorTotal; parcela >= 1 ; parcela--) {
               double valorParcela = valorTotal / parcela;
               if (valorParcela < 1000) {
                   continue; // somente irá imprimir quando o valor for maior que 1000
               }
               System.out.println("Parcela "+ parcela+ " R$ "+ valorParcela);
           }
        }
    }
