package Exercicios;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite uma data (dd/mm/aaaa)");
        String data = entrada.nextLine();

        System.out.println(Funcoes.mesExtenso(data));


    }
}
