package com.livs.maratonajava.introducao;

public class Aula05EstruturasCondiconais05 {
    public static void main(String[] args) {
        // imprima o dia da semana, considerando 1 como domingo
        byte dia = 50;
        // sintaxe aceita apenas char, int, byte, short, enum, String
        switch (dia) {
            default:
                System.out.println("Opção inválida");
                break;
            case 1:
                System.out.println("Dom");
                break;
            case 2:
                System.out.println("Seg");
                break;
            case 3:
                System.out.println("Ter");
                break;
            case 4:
                System.out.println("Qua");
                break;
            case 5:
                System.out.println("Qui");
                break;
            case 6:
                System.out.println("Sex");
                break;
            case 7:
                System.out.println("Sab");
                break;
        }

        //Apontando o sexo biológico

        char sexo = 'F';
        switch (sexo) {
            case 'F':
                System.out.println("Mulher");
                break;
            case 'M':
                System.out.println("Homem");
                break;
            default:
                System.out.println("Inválido");
                break;
        }
    }
}
