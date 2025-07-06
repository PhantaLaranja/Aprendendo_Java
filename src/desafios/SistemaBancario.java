package desafios;

import java.util.Scanner;

public class SistemaBancario {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double saldo = 2500.00;

        System.out.printf(
                """
                       %n***********************************************
                        Dados iniciais do cliente:
                       
                        Nome:            Luiggi Oliveira
                        Tipo de conta:   Corrente
                        Saldo inicial:   R$ %.2f
                       ***********************************************%n
                       """, saldo);

        int parar = 1;
        while (parar > 0) {
            System.out.printf(
                    """ 
                            %nOperações:
                            1 - Consultar saldos
                            2 - Depositar
                            3 - Sacar 
                            4 - Sair
                            Digite a opção desejada:%n
                            """);
            int opcoes = leitor.nextInt();
            switch (opcoes) {
                case 1:
                    System.out.printf("%n---Seu saldo é %.2f---%n", saldo);
                    break;
                case 2:
                    System.out.printf("%n---Digite o valor a ser depositado---%n");
                    double deposito = leitor.nextDouble();
                    saldo += deposito;
                    System.out.printf("%n---Seu saldo foi atualizado para %.2f---%n", saldo);
                    break;
                case 3:
                    System.out.printf("%n---Digite o valor a ser sacado---%n");
                    double saque = leitor.nextDouble();

                    if (saldo >= saque) {
                        saldo -= saque;
                        System.out.printf("%n---Seu saldo foi atualizado para %.2f---%n", saldo);
                    } else {
                        System.out.printf("%n---Saldo insuficiente. Não foi possível sacar esse valor---%n");
                    }
                    break;
                case 4:
                    System.out.printf("%n---Encerrando operação---%n");
                    parar = 0;
                    break;
                default:
                    System.out.printf("%n---Opção inválida---%n");
            }
        }
    }
}
