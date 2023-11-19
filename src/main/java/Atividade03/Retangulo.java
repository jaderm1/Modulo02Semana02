package Atividade03;

public class Retangulo {
   private   float comprimento =50;
   private  float largura =1;

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }

    public void setComprimento(int comprimento){
        if (comprimento > 0 && comprimento < 20){
            this.comprimento = comprimento;}
        else {
            System.out.println("Insira um valor entre 0,0 e 20,0");
        }

        }



        public  void setLargura(int largura){
            if (largura > 0 && largura < 20){
                this.largura = largura;}
            else {
                System.out.println("Insira um valor entre 0,0 e 20,0");
            }

            }



    public void perimetro(){
    System.out.println("Perimetro: " + (comprimento*2 + largura*2));
   }
}