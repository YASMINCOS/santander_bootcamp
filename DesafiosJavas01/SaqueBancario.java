package DesafiosJavas01;

import java.util.Scanner;

public class SaqueBancario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int saldoTotal = scanner.nextInt();

        int valorSaque = scanner.nextInt();

        if (saldoTotal >= valorSaque) {
            saldoTotal -= valorSaque;
            System.out.printf("Saque realizado com sucesso. Novo saldo: %d%n", saldoTotal);
        } else {
            System.out.println("Saldo insuficiente. Saque nao realizado!");
        }

        scanner.close();
    }
}