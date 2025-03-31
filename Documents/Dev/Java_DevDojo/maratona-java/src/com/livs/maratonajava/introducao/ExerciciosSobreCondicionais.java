package com.livs.maratonajava.introducao;

import java.util.Scanner; // importa a classe Scanner

public class ExerciciosSobreCondicionais {
    public static void main(String[] args) {
        // verifica notas de alunos

        float notaAluno = 7;
        String resultado;

        if (notaAluno >= 7) {
            resultado = "Aprovado";
        } else if (notaAluno >= 5 && notaAluno < 7) {
            resultado = "Recuperação";
        } else {
            resultado = "Reprovado";
        }
        System.out.println(resultado); // Aprovado

        // verifica idade e indica categoria etária

        int idade = 37;
        String categoriaEtaria;

        if (idade < 0) {
            categoriaEtaria = "Idade inválida";
        } else if (idade >= 0 && idade <= 12) {
            categoriaEtaria = "Criança";
        } else if (idade >= 13 && idade <= 17) {
            categoriaEtaria = "Adolescente";
        } else if (idade >= 18 && idade <= 59) {
            categoriaEtaria = "Adulto";
        } else {
            categoriaEtaria = "Idoso";
        }
        System.out.println(categoriaEtaria); // Adulto

        // verifica numero positivo ou negativo

        int numero = -67;
        String validaNumero;

        if (numero < 0) {
            validaNumero = "Numero Negativo";
        } else if (numero > 0) {
            validaNumero = "Numero Positivo";
        } else {
            validaNumero = "Zero";
        }
        System.out.println(validaNumero); // Numero Negativo

        // classificação de triangulos com base em lados

        int ladoA = 30;
        int ladoB = 30;
        int ladoC = 40;
        String tipoDeTriangulo;

        if (ladoA == ladoB && ladoB == ladoC) {
            tipoDeTriangulo = "Triângulo Equilátero";
        } else if (ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
            tipoDeTriangulo = "Triângulo Isósceles";
        } else {
            tipoDeTriangulo = "Triângulo Escaleno";
        }
        System.out.println(tipoDeTriangulo); // Triângulo Isósceles

        // triangulo válido

        int A = 5;
        int B = 6;
        int C = 7;
        String resultadoAnalise;

        if (A + B > C && A + C > B && B + C > A) {
            resultadoAnalise = "Os lados formam um triângulo válido!";
        } else {
            resultadoAnalise = "Os lados NÃO formam um triângulo.";
        }
        System.out.println(resultadoAnalise); // Os lados formam um triângulo válido!

        Scanner scanner = new Scanner(System.in); // Cria o Scanner

        // Solicita peso e altura ao usuário
        System.out.print("Digite seu peso (kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite sua altura (m): ");
        double altura = scanner.nextDouble();

        // Calcula IMC
        double IMC = peso / (altura * altura);
        String classificacao;

        if (IMC < 18.5){
            classificacao = "Abaixo do Peso";
        } else if (IMC >= 18.5 && IMC <= 24.9){
            classificacao = "Peso normal";
        } else if (IMC >= 25 && IMC <= 29.9){
            classificacao = "Sobrepeso";
        } else if (IMC >= 30 && IMC <= 34.9) {
            classificacao = "Obesidade grau 1";
        } else if (IMC >= 35 && IMC <= 39.9) {
            classificacao = "Obesidade grau 2";
        } else {
            classificacao = "Obesidade grau 3";
        }
        // Exibe o resultado
        System.out.printf("Seu IMC é %.2f - %s%n", IMC, classificacao);

        scanner.close(); // Fecha o Scanner (boa prática)

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

    }
}