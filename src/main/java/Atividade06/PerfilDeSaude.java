package Atividade06;

public class PerfilDeSaude {
    private String nome ="";
    private String sobrenome ="";
    private String sexo="";
    private int dia=0;
    private int mes=0;
    private int ano=0;
    private double altura=0;
    private double peso=0;

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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
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

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void idadeAnos(){
        int idade = 2023 - ano;
    }
public Object frequenciaMaxima(){
        int frequencia = 220 - (2023 - ano);
        System.out.println("Frequencia Maxima: " + frequencia);
        return null;
    }
    public Object frequenciaAlvo(){
        double alvo1 = 0.5 * (220 - (2023 - ano));
        double alvo2 = 0.85 * (220 - (2023 - ano));
        System.out.println("Frequencia Alvo: " + alvo1 + " - " + alvo2);
        return null;
    }
    public Object imc(){
        double imc = peso / (altura * altura);
        System.out.println("IMC: " + imc);
        return null;
    }

}
