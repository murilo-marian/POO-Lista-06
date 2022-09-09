package Exercicios;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int num = entrada.nextInt();

        System.out.println(Funcoes.inverteNumero(num));

    }
}
