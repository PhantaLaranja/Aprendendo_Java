package desafios;

import java.util.Random;
import java.util.Scanner;

public class JogoDeAdivinhacao {
    public static void main(String[] args) {
        int tentativas = 5;
        int palpite = 0;
        int numeroAleatorio = new Random().nextInt(100);
        Scanner leitor = new Scanner(System.in);

        System.out.println("Tente adivinhar qual é o número da secreto");

        while (tentativas > 0) {
            System.out.printf("Digite um número entre 0 e 100. Número de tentativas: %d%n", tentativas);
            palpite = leitor.nextInt();

            if (palpite == numeroAleatorio){
                System.out.printf("Você acertou o número da secreto!");
                break;
            }
            else {
                tentativas--;
                if (palpite < numeroAleatorio) {
                    System.out.println("O número secreto é maior");
                }
                else {
                    System.out.println("O número secreto é menor");
                }
            }
        }

        System.out.printf("O número secreto era %d", numeroAleatorio);
    }
}
