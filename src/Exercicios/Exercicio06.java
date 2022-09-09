package Exercicios;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int rodando = -1;
        do {
            System.out.println("Digite o horário: ");
            String horario = entrada.nextLine();

            String hora = horario.substring(0, 2);
            String minuto = horario.substring(3, 5);

            int horaInt = Integer.parseInt(hora);
            int minutoInt = Integer.parseInt(minuto);

            System.out.println(Funcoes.converteHora(horaInt, minutoInt));

            System.out.println("Deseja continuar? (0 - sair/ 1 - continuar)");
            rodando = entrada.nextInt();
        } while (rodando != 0);

        entrada.close();

    }
}
