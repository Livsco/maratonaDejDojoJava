package com.livs.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int numero01 = 10;
        int numero02 = 20;

        // soma valores com o operador
        System.out.println(numero01+numero02);

        // concatena os valores pois o operador está após a string
        System.out.println( "Valor " +numero01+numero02);

        // soma os valores antes da string e concatena depois
        System.out.println(numero02+numero01+ " Valor "+numero02+numero01);

        // sugere-se o armazenamento em uma variável
        int resultado = numero01 * numero02;
        System.out.println(resultado);

        // operador de resto % também pode ser usado para descobrir valores pares ou impares
        int resto01 = 21 % 2;
        int resto02 = 20 % 2;
        System.out.println(resto01);
        System.out.println(resto02);

        // operadores lógicos sempre retornam valores boleano
        // < > <= >= == !=

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10.0;
        boolean isDezDiferenteDez = 10 != 10;

        System.out.println("isDezMaiorQueVinte "+isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte "+isDezMenorQueVinte);
        System.out.println("isDezIgualVinte "+ isDezIgualVinte);
        System.out.println("isDezIgualDez "+isDezIgualDez);
        System.out.println("isDezDiferenteDez "+ isDezDiferenteDez);

        // operadores relacionais TRÊS TIPOS: && (AND) || (OR) ! (NOT)

        // exemplo de &&

        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta "+isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta "+isDentroDaLeiMenorQueTrinta);

         // exemplo de ||

        double valorTotalContaCorrente = 200;
        double valotTotalContaPoupanca = 10000;
        float valorSetup = 5000F;

        boolean isSetupCompravel = valorTotalContaCorrente > valorSetup || valotTotalContaPoupanca > valorSetup;
        System.out.println("isSetupCompravel "+isSetupCompravel);

        // operadores de atribuição = += -= *= /= %=

        double bonus = 1800; //1800
        bonus += 1000; // 2800
        bonus *= 2; // 5600
        bonus -= 3000; // 2600
        bonus %= 2; // 0,0
        System.out.println(bonus);

        // ++ -- (diferente no inicio da variável e no final)
        int contador = 0;
        contador += 1; // contador = contador +1;
        contador++;
        contador--;
        ++contador; // incrementa antes
        --contador; // incrementa antes
        int contador2 = 0;
        System.out.println(contador); // 1
        System.out.println(contador2++); // incrementa após imprimir, neste caso seria 1
        System.out.println(++contador2); //incrementa primeiro, como já tinhamos 1, ficou 2

    }
}
