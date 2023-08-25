package main;

import utilitarios.Utils;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Por favor, digite o número da sua conta: ");
        int numeroConta = input.nextInt();

        System.out.println("Digite a agência: ");
        String agencia = input.next();

        System.out.println("Insira seu nome: ");
        String nomeCliente = input.next();

        System.out.println("Digite o seu saldo: ");
        Double saldo =input.nextDouble();

        System.out.println("Ola " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + numeroConta + " e o seu saldo de R$: " + Utils.formatarParaReais(saldo)+ "já está disponível para saque.");




    }
}