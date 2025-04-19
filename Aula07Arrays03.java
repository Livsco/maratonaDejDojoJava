package com.livs.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        // formas de inicialização do array

        // indicando inicialmente o tamnanho do array
        int [] numeros = new int[3];

        // declarando o array
        int [] numeros2 = {1,2,3,4,5};

        //  iniciando o array e declarando seus valores
        int [] numeros3 = new int [] {5,4,3,2,1};
        // Neste for é possível acessar as variaveis pelo índice, incrementando a cada print
        for (int i = 0; i < numeros3.length; i++) {
            System.out.println(numeros3[i]); // 5 4 3 2 1
        }
        // no foreach não é possível acessar o índice, apenas acessamos os valores - utilizamos uma variável local
        for(int num : numeros2){
            System.out.println(num);

            // Na prática, o foreach está fazendo o passo a passo abaixo:
            //int num = numeros2[0];
            //System.out.println(num);
            //int num = numeros2[0];
            //System.out.println(num);
            //int num = numeros2[0];
            //System.out.println(num);
        }
    }
}
