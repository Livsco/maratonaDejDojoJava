package com.livs.maratonajava.introducao;

public class Aula06EstruturasDeRepetição02 {
    public static void main(String[] args) {
        // imprima todos os números pares de 0 até 1.000.000
        // esta solução não é a ideal, pois a mudança em i pode gerar uma contagem impar
        // for (int i = 0; i < 1000000; i+=2)
        // Indica o resto, pois dessa forma é possível validar o resto postivo

        for (int i = 1; i < 1000000; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
