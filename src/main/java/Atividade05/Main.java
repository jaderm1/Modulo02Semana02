package Atividade05;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner nome = new Scanner(System.in);
        System.out.println("Insira o seu nome:");
        String nome1 = nome.nextLine();
        Scanner sobrenome = new Scanner(System.in);
        System.out.println("Insira o seu sobrenome:");
        String sobrenome1 = sobrenome.nextLine();
        Scanner dia = new Scanner(System.in);
        System.out.println("Insira o dia do seu nascimento:");
        int dia1 = dia.nextInt();
        Scanner mes = new Scanner(System.in);
        System.out.println("Insira o mes do seu nascimento:");
        int mes1 = mes.nextInt();
        Scanner ano = new Scanner(System.in);
        System.out.println("Insira o ano do seu nascimento:");
        int ano1 = ano.nextInt();
        FrequenciaCardiaca pessoa = new FrequenciaCardiaca();
        pessoa.setNome(nome1);
        pessoa.setSobrenome(sobrenome1);
        pessoa.setDia(dia1);
        pessoa.setMes(mes1);
        pessoa.setAno(ano1);

        System.out.printf("Nome: %s %s\n", pessoa.getNome(), pessoa.getSobrenome());
        pessoa.idadeAnos();
        pessoa.frequenciaMaxima();
        pessoa.frequenciaAlvo();
    }
}
