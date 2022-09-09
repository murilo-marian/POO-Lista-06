package Exercicios;

public class Funcoes {
    public static String piramide (int n1) {
        StringBuilder piramidal = new StringBuilder();
        for (int i = 0; i < n1; i++) {
            piramidal.append(String.valueOf(i).repeat(i));
            piramidal.append("\n");
        }
        return piramidal.toString();
    }

    public static String contadorPiramide(int n1) {
        StringBuilder piramidal = new StringBuilder();
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j <= i; j++) {
                piramidal.append(j+1);
            }
            piramidal.append("\n");
        }
        return piramidal.toString();

    }

    public static int someTres(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public static String testaPositivo(int num1) {
        if (num1 > 0) {
            return "P";
        } else {
            return "N";
        }
    }

    public static float somaImposto(float taxaImposto, float custo) {
        return ((taxaImposto/100) * custo) + custo;
    }

    public static String converteHora(int hora, int minutos) {
        int horaMilitar = hora % 12;
        String horaConvertida = horaMilitar+ ":" + minutos;
        if (hora >= 12) {
            horaConvertida += " PM";
        } else {
            horaConvertida += " AM";
        }
        return horaConvertida;
    }

    public static float valorPagamento(float valor, int atraso) {
        float valorAtrasado;
        if (atraso == 0) {
            return valor;
        } else {
            valorAtrasado = (float) (valor + ((valor * (atraso*0.01)) + ((valor*0.03))));
            return valorAtrasado;
        }
    }

    public static int contaDigito(int n) {
        String strNum = String.valueOf(n);

        return strNum.length();
    }

    public static int inverteNumero(int n) {
        StringBuilder strNum = new StringBuilder(String.valueOf(n));
        strNum.reverse();
        return Integer.parseInt(String.valueOf(strNum));
    }

    /*public static String craps() {

    }*/

    public static String mesExtenso(String data) {

        String dia = data.substring(0, 2);
        String mes = data.substring(3, 5);
        String ano = data.substring(6, 10);

        String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio",
                "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};

        int diaInt = Integer.parseInt(dia);
        int mesInt = Integer.parseInt(mes);
        int anoInt = Integer.parseInt(ano);

        String strMes;

        if (diaInt > 31 || diaInt < 1) {
            return null;
        } else if (mesInt > 12 || mesInt < 1) {
            return null;
        } else if (anoInt < 1) {
           return null;
        } else if (mesInt == 2 && diaInt > 29) {
            return null;
        } else if (mesInt == 2 && diaInt == 29 && anoInt % 4 != 0 && anoInt % 100 != 0 && anoInt % 400 != 0) {
            return null;
        } else {
            strMes = meses[mesInt];
            return diaInt + " de " + strMes + " de " + anoInt;


        }
    }
}
