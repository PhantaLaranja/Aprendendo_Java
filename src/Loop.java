import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double mediaNota = 0;
        double nota = 0;

        for (int i = 0; i < 3; i++) { //fori
            System.out.println("Qual é a sua avaliação para o filme? de 0 a 10 ");
            nota = scanner.nextDouble();
            mediaNota += nota;
        }
        System.out.println("Media de avaliações:" + mediaNota/3);

    }
}
