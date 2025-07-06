package coisas;

public class FormatterTextos {
    public static void main(String[] args) {
        String nome = "Maria";
        int idade = 30;
        double valor = 59.999;
        System.out.printf("Meu nome é %s, eu tenho %d anos e hoje gastei %.2f reais%n", nome, idade, valor);
    }
    public static class ComparandoStrings {
        public static void main(String[] args) {
            String senha = "12345";
            if (senha.equals("12345")) {
                System.out.println("Acesso autorizado!");
            } else {
                System.out.println("Senha incorreta");
            }
        }
    }
    public static class TextBlock {
        public static void main(String[] args) {
            String nome = "João";
            int aulas = 4;

            String mensagem = """
                    Olá, %s!
                    Boas vindas ao curso de Java.
                    Teremos %d aulas para te mostrar o que é preciso para você dar o seu primeiro mergulho na linguagem!
                    """.formatted(nome, aulas);
            System.out.println(mensagem);
        }
    }
}
