package DesafiosJavas01;
import java.util.Scanner;

public class BalanceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldoAtual = scanner.nextDouble();
        double valorDeposito = scanner.nextDouble();
        double valorRetirada = scanner.nextDouble();
        
        double saldoAtualizado = saldoAtual + valorDeposito - valorRetirada;
        System.out.printf("Saldo atualizado na conta: %.1f%n", saldoAtualizado);

        scanner.close();
    }
}

