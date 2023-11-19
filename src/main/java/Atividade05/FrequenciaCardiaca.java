package Atividade05;

public class FrequenciaCardiaca {
    private String nome="";
    private String sobrenome="";
    private int dia=0;
    private int mes=0;
    private int ano=0;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    public void idadeAnos(){
        int idade = 2023 - ano;
    }
    public Object frequenciaMaxima(){
        int frequencia = 220 - (2023 - ano);
        System.out.println("Frequencia Maxima: " + frequencia);
        return null;
    }
}
