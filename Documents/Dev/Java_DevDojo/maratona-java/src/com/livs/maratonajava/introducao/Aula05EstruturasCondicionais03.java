package com.livs.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args){
        // Doar se salario > 6000

        double salario = 6000;
        String mensagemDoar = "Eu vou doar 500 para alguém";
        String mensagemNaoDoar = "Ainda não tenho condições, mas terei!";

        // usando operador ternário sempre precisará da indicação do retorno
        // sintaxe (condicao) ? verdadeiro : falso
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);


    }
}
