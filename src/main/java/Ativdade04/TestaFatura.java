package Ativdade04;

public class TestaFatura {
    public static void main(String[] args) {
        Fatura novaFatura = new Fatura();
        novaFatura.descricao="Fatura Teste 01";
        novaFatura.quantidade=-10;
        novaFatura.preco=5.0;
        novaFatura.getValorFatura();

    }
}
