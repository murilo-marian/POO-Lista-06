package Exercicios;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o número a ser retornado: ");
        int num = entrada.nextInt();
        System.out.println(Funcoes.contadorPiramide(num));

        entrada.close();

    }
}
