package Atividade06;

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
        System.out.println("Insira a sua altura:");
        double altura1 = ano.nextDouble();
        System.out.println("Insira o seu peso:");
        double peso1 = ano.nextDouble();
        Scanner sexo = new Scanner(System.in);
        String sexo1 = sexo.nextLine();




        PerfilDeSaude perfil01 = new PerfilDeSaude();
        perfil01.setNome(nome1);
        perfil01.setSobrenome(sobrenome1);
        perfil01.setSexo(sexo1);
        perfil01.setDia(dia1);
        perfil01.setMes(mes1);
        perfil01.setAno(ano1);
        perfil01.setAltura(altura1);
        perfil01.setPeso(peso1);

        perfil01.idadeAnos();
        perfil01.frequenciaMaxima();
        perfil01.frequenciaAlvo();
        perfil01.imc();



    }
}
