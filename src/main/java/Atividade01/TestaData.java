package Atividade01;

import java.util.Scanner;

public class TestaData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o dia");
        int dia = scanner.nextInt();

        System.out.println("Insira o mes");
        int mes = scanner.nextInt();

        System.out.println("Insira o ano");
        int ano = scanner.nextInt();

        Data data = new Data(dia, mes, ano);
        data.imprimir();

        scanner.close();
    }
}