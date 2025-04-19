package com.livs.maratonajava.introducao;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        // meses 1,2,3,4,5
        // dias 31,28,31,30
        // sintaxe do array multidimensional - é possível indicar a segunda dimensão após
        int[][] dias = new int [3][3];
        dias[0][0] = 31;
        dias[0][1] = 28;
        dias[0][2] = 31;

        dias[1][0] = 31;
        dias[1][0] = 28;
        dias[1][0] = 31;

        // criamos o looping para iterar o primeiro array, somente após a conclusão do print do segundo array
        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }
        System.out.println("--------------------------");

        // no for each criamos a variável local arrBase para referência no array multidimensional
        for (int[] arrBase: dias){
            for (int num: arrBase) {
                System.out.println(num);
            }
        }
    }
}
