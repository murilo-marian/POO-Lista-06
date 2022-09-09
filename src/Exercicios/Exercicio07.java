package Exercicios;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Float> valores = new ArrayList<>();
        int quantPrestacoes = 0;
        float valorTotal = 0;

        int continua;
        do {
            quantPrestacoes++;
            System.out.print("Valor da parcela: ");
            float parcela = entrada.nextFloat();
            System.out.print("Quantos dias de atraso?: ");
            int atraso = entrada.nextInt();

            System.out.print("Valor com juros: R$");
            System.out.println(Funcoes.valorPagamento(parcela, atraso));
            valores.add(Funcoes.valorPagamento(parcela, atraso));

            System.out.print("Continuar? (1 = sim / 2 = não): ");
            continua = entrada.nextInt();
        } while (continua == 1);
        
        System.out.println("Relatório diário");
        System.out.print("Quantidade de parcelas pagas: " + quantPrestacoes);
        for (int i = 0; i < quantPrestacoes; i++) {
            valorTotal += valores.get(i);
        }
        System.out.println("Valor total: " + valorTotal);
    }
}
