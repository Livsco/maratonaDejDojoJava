package com.livs.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main (String[] args) {

        int idade = 20;
        boolean isAutorizacaoComprarBebida = idade >= 18;

        if (isAutorizacaoComprarBebida) {
            System.out.println("Autorizado a comprar bebida alcólica");
        }else{
            System.out.println("Não autorizado a comprar bebida alcólica");
        }
        // !
        if (!isAutorizacaoComprarBebida == false) {
            System.out.println("Não autorizado a comprar bebida alcólica");
        }

        System.out.println("Não autorizado a comprar bebida alcólica");

    }
}
