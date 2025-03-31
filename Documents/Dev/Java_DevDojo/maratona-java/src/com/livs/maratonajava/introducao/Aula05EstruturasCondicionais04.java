package com.livs.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {
    // € 0 ---- € 34,712     9,70%
    // € 34,713 ---- € 68,507     37,35%
    // € 68,508    49,50%

public static void main(String[] args){
    //Calcula imposto

    double salarioAnual = 51.683;
    String impostoSobSalarioAnual;

    if (salarioAnual < 34.712) {
        impostoSobSalarioAnual = "9.70%";
    }else if (salarioAnual >= 34.713 && salarioAnual <= 68.507) {
        impostoSobSalarioAnual = "37.35%";
    }else {
        impostoSobSalarioAnual = "49.50%";
    }
    // exibe imposto
    System.out.println(impostoSobSalarioAnual);

    // Calculando o valor a pagar em euros

    double salarioAnualEuro = 70000;
    double primeiraFaixa = 9.70 / 100;
    double segundaaFaixa = 37.35 / 100;
    double terceiraFaixa = 49.50 /100;
    double valorImposto;

    if (salarioAnualEuro <= 34712) {
        valorImposto = salarioAnualEuro * primeiraFaixa;
    } else if (salarioAnualEuro >= 34713 && salarioAnualEuro <= 68507) {
        valorImposto = salarioAnualEuro * segundaaFaixa;
    } else {
        valorImposto = salarioAnualEuro * terceiraFaixa;
    }
    System.out.println(valorImposto);
  }
}