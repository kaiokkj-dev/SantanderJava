package maquinabanho;

import java.util.Scanner;

public class MinhaMaquina {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MaquinaBanho maquina = new MaquinaBanho();
        int opcao = 0;
        while (opcao != 10) {
            System.out.println("\n===== MAQUINA DE BANHO =====");
            System.out.println("1 - Colocar pet");
            System.out.println("2 - Retirar pet");
            System.out.println("3 - Dar banho");
            System.out.println("4 - Limpar maquina");
            System.out.println("5 - Abastecer agua");
            System.out.println("6 - Abastecer shampoo");
            System.out.println("7 - Verificar nivel de agua");
            System.out.println("8 - Verificar nivel de shampoo");
            System.out.println("9 - Verificar se existe pet na maquina");
            System.out.println("10 - Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = sc.nextInt();
            if (opcao == 1) {
                maquina.colocarPet();
            } else if (opcao == 2) {
                maquina.retirarPet();
            } else if (opcao == 3) {
                maquina.darBanho();
            } else if (opcao == 4) {
                maquina.limparMaquina();
            } else if (opcao == 5) {
                maquina.abastecerAgua();
            } else if (opcao == 6) {
                maquina.abastecerShampoo();
            } else if (opcao == 7) {
                System.out.println(
                    "Nivel de agua: "
                    + maquina.verificarNivelAgua()
                    + " litros."
                );
            } else if (opcao == 8) {
                System.out.println(
                    "Nivel de shampoo: "
                    + maquina.verificarNivelShampoo()
                    + " litros."
                );
            } else if (opcao == 9) {
                if (maquina.verificarPet()) {
                    System.out.println("Existe um pet na maquina.");
                } else {
                    System.out.println("Nao existe pet na maquina.");
                }
            } else if (opcao == 10) {
                System.out.println("Encerrando a maquina...");
            } else {
                System.out.println("Opcao invalida.");
            }
        }
        sc.close();
    }
}
