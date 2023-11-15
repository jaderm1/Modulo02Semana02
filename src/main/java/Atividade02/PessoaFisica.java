package Atividade02;

public class PessoaFisica {
    private String nome;
    private String cpf;
    private String dataNascimento;

    public PessoaFisica(String cpf) {
        this.cpf = cpf;
    }

    public void imprimir() {
        System.out.println("Nome: " + nome + "\nCPF: " + cpf + "\nData de Nascimento: " + dataNascimento);
    }
}
