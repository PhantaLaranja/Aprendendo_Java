import java.sql.SQLOutput;
import java.util.Scanner;

public class LeituraDados {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito: ");
        String filme = leitura.nextLine();
        System.out.println("Qual é o ano de lançamento?");
        int anoDeLancamento = leitura.nextInt();
        System.out.println("Qual é a sua avaliação para o filme? de 0 a 10 ");
        double avaliacao = leitura.nextDouble();

        System.out.printf("Filme: %s |Ano de lançamento: %d |Avaliação: %.2f".formatted(filme, anoDeLancamento, avaliacao));
    }
}
