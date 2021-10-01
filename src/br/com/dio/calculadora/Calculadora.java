package br.com.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Digite o numero 1:");
        int a = scn.nextInt();
        System.out.println("Digite o numero 2:");
        int b = scn.nextInt();

        int soma = soma(a, b);
        int subtrair = subtrair(a, b);
        int multiplicar = multiplicar(a, b);
        int dividir = dividir(a, b);

        System.out.println("Soma " + soma);
        System.out.println("Subtrair " + subtrair);
        System.out.println("Multiplicar " + multiplicar);
        System.out.println("Dividir " + dividir);
    }

    public static int soma(int a, int b) {
        return a + b;
    }

    public static int subtrair(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static int dividir(int a, int b) {
        return a / b;
    }
}
