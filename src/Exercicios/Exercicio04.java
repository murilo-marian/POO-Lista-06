package Exercicios;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int n1 = entrada.nextInt();

        System.out.println(Funcoes.testaPositivo(n1));

        entrada.close();

    }
}
