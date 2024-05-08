package org.example;
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        String numero;
        String agencia;
        String nomeCliente;
        double saldo;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite o número da Agência !");
        numero  = scanner.nextLine();

        System.out.print("Por favor, digite seu nome:");
        nomeCliente = scanner.nextLine();

        System.out.print("Por favor, digite a sua Agência !");
        agencia  = scanner.nextLine();

        System.out.print("Por favor, digite o seu saldo!");
        saldo  = Double.parseDouble(scanner.nextLine());

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo de R$" + saldo + " já está disponível para saque.");


    }
}
