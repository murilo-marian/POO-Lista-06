package Exercicios;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Preço: ");
        float preco = entrada.nextFloat();
        System.out.println("Imposto em %: ");
        float imposto = entrada.nextFloat();

        System.out.println(Funcoes.somaImposto(imposto, preco));
    }
}
