package Ativdade04;

public class Fatura {
    String valor;
    String descricao;
    int quantidade;
    double preco;

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void getValorFatura(){
        if (quantidade < 0)
            quantidade = 0;
        if (preco < 0)
            preco = 0.0;

        double valorFatura = preco * quantidade;

        System.out.println("Valor da fatura: " + valorFatura);



    }
}
