package coisas;

import java.util.Scanner;

public class OutroLoop
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        double mediaNota = 0;
        double nota = 0;

        int contador = 0;
        while (nota != -1)
        {
            System.out.println("Nota para o filme de 0 a 10. Digite -1 caso queira encerrar.");
            nota = scanner.nextDouble();

            if (nota != -1)
            {
                contador++;
                mediaNota += nota;
            }
        }
        System.out.println("Media de avaliações:" + mediaNota/contador);
    }
}
