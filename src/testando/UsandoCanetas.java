package testando;

public class UsandoCanetas {
    public static void main(String[] args) {
        Canetas c1 = new Canetas(); //instanciando um objeto
        c1.cor = "Azul";
        c1.ponta = 0.5f; //não esqueça de por f no final
        c1.destampar();
        c1.status(); //chamada a um metodo ao inves de um atributo
        c1.rabiscar();

        Canetas c2 = new Canetas();
        c2.modelo = "Bic";
        c2.cor = "preta";
        c2.tampar();
        c2.status();
        c2.rabiscar();
    }
}
