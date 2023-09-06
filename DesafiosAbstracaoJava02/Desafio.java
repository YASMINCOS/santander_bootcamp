package DesafiosAbstracaoJava02;

import java.util.Scanner;

public class Desafio {

  public static void main(String[] args) {
    // Lendo os dados de Entrada:
    Scanner scanner = new Scanner(System.in);
    int numeroConta = scanner.nextInt();
    scanner.nextLine(); // Consome a quebra de linha após a entrada do número da conta
    String nomeTitular = scanner.nextLine();
    double saldo = scanner.nextDouble();

    // Criar uma instância de "ContaBancaria" com os valores de Entrada.
    ContaBancaria conta = new ContaBancaria(numeroConta, nomeTitular, saldo);

    System.out.println("Informacoes:");
    // Imprimir as informações da conta usando o objeto criado acima.
    System.out.println("Conta: " + conta.getNumero());
    System.out.println("Titular: " + conta.getTitular());
    System.out.println("Saldo: R$ " + conta.getSaldo());
  }
}

class ContaBancaria {
  private int numero;
  private String titular;
  private double saldo;

  public ContaBancaria(int numero, String titular, double saldo) {
    this.numero = numero;
    this.titular = titular;
    this.saldo = saldo;
  }

  public int getNumero() {
    return numero;
  }

  public String getTitular() {
    return titular;
  }

  public double getSaldo() {
    return saldo;
  }
}

