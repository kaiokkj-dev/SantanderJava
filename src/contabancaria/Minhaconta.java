package contabancaria;

import java.util.Scanner;
public class Minhaconta {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o deposito inicial: ");
        double depositoInicial = sc.nextDouble();
        ContaBancaria conta = new ContaBancaria(depositoInicial);
        int opcao = 0;
        while (opcao != 6) {
            System.out.println("\n===== BANCO =====");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Pagar boleto");
            System.out.println("5 - Verificar cheque especial");
            System.out.println("6 - Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = sc.nextInt();
            if (opcao == 1) {
                System.out.println("Saldo: " + conta.consultarSaldo());
            } else if (opcao == 2) {
                System.out.print("Digite o valor do deposito: ");
                double valor = sc.nextDouble();
                conta.depositar(valor);
                System.out.println("Deposito realizado.");
            } else if (opcao == 3) {
                System.out.print("Digite o valor do saque: ");
                double valor = sc.nextDouble();
                conta.sacar(valor);
            } else if (opcao == 4) {
                System.out.print("Digite o valor do boleto: ");
                double valor = sc.nextDouble();
                conta.pagarBoleto(valor);
            } else if (opcao == 5) {
                System.out.println("Usando cheque especial: " + conta.verificarChequeEspecial());
            } else if (opcao == 6) {
                System.out.println("Saindo...");
            } else {
                System.out.println("Opcao invalida.");
            }
        }
        sc.close();
    }
}
