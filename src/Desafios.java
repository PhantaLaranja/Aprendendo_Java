import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Desafios {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        System.out.println("Escreva um número para verificar se é positivo ou negativo");
        float numero = leitor.nextFloat();

        if (numero > 0) {
            System.out.println("É um número positivo");
        }
        else if (numero < 0) {
            System.out.println("É um número negativo");
        }
        else {
            System.out.println("O zero é um número neutro, logo, não é nem positivo, nem negativo.");
        }
    }

    public static class ComparandoInteiros {
        public static void main(String[] args) {
            Scanner leitor = new Scanner(System.in);

            System.out.printf("Digite o primeiro número inteiro%n");
            int num1 = leitor.nextInt();
            System.out.printf("Digite o segundo número inteiro%n");
            int num2 = leitor.nextInt();

            if (num1 > num2) {
                System.out.printf("Os números são diferentes, pois o primeiro número %d é maior que o segundo número %d.", num1, num2);
            }
            else if (num1 < num2) {
                System.out.printf("Os números são diferentes, pois o segundo número %d é maior que o primeiro número %d.", num2, num1);
            }
            else {
                System.out.printf("Ambos números digitados %d são iguais.", num1);
            }
        }
    }

    public static class CalculandoAreas {
        public static void main(String[] args) {
            Scanner leitor = new Scanner(System.in);

            System.out.printf(
                    """
                    Para calcular a área do quadrado, digite 1.
                    Para calcular a área do círculo, digite 2.%n
                    """);

            int opcao = leitor.nextInt();;
            switch (opcao) {
                case 1:
                    System.out.printf("Digite o valor do lado do quadrado%n");
                    double lado = leitor.nextDouble();
                    double areaQuadrado = Math.pow(lado, 2); //para calcular a potência
                    System.out.printf("A área do quadrado é %.2f", areaQuadrado);
                    break;
                case 2:
                    System.out.printf("Digite o valor do raio do círculo%n");
                    double raio = leitor.nextDouble();
                    double areaCirculo = Math.pow(raio, 2) * 3.14159;
                    System.out.printf("A área do círculo é %.2f", areaCirculo);
                    break;
                default:
                    System.out.print("Número inválido. Digite apenas ou 1 ou 2.");
                    break;
            }
        }
    }

    public static class Tabuada {
        public static void main(String[] args) {
            Scanner leitor = new Scanner(System.in);

            System.out.printf("Digite um número para exibir sua tabuada.%n");
            int num = leitor.nextInt();

            for (int i = 1; i < 11 ; i++) {
                int valor = num * i;
                System.out.printf("%d x %d = %d%n".formatted(num, i, valor));
            }
        }
    }

    public static class ImparOuPar {
        public static void main(String[] args) {
            Scanner leitor = new Scanner(System.in);

            System.out.println("Digite um número para verificar se ele é par ou ímpar");
            int numero = leitor.nextInt();

            if (numero % 2 == 0) {
                System.out.println("Esse número é divisível por 2, logo, é par.");
            } else {
                System.out.println("Esse número é divisível por 3, logo, é ímpar.");
            }
        }
    }

    public static class Fatorial {
        public static void main(String[] args) {
            Scanner leitor = new Scanner(System.in);

            System.out.printf("Digite um número para calcular seu fatorial%n");
            int numero = leitor.nextInt();
            int fatorial = 1;

            if (numero < 0) {
                System.out.println("O número digitado não pode ser negativo.");
            }
            else {
                for (int i = 0; i < numero; i++) {
                    fatorial *= numero - i;
                }

                System.out.printf("O valor do fatorial desse número é %d", fatorial);
            }
        }
    }
}
