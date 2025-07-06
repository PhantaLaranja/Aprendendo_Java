package testando;

public class Canetas {
    public String modelo;
    public String cor;
    public float ponta;
    public int carga;
    public boolean tampada;

    public void status() {
        System.out.println("Uma caneta " + this.cor ); //o this referencia a qual objeto está chamado
        System.out.println("Qual é a tamanho da ponta? " + this.ponta);
        System.out.println("Está tampada? " + this.tampada);
    }

    public void rabiscar() {
        if (this.tampada) {
            System.out.println("Erro! Não posso rabiscar com a caneta tampada!");
        } else {
            System.out.println("Estou rabiscando.");
        }
    }
    public void tampar() {
        this.tampada = true;
    }
    public void destampar() {
        this.tampada = false;
    }
}
