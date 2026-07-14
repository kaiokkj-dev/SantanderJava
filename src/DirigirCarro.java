import java.util.Scanner;
public class DirigirCarro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car carro = new Car();
        int opcao = 0;
        while (opcao != 10) {
            System.out.println("\n===== DIRIJA SEU CARRO =====");
            System.out.println("1 - Ligar");
            System.out.println("2 - Desligar");
            System.out.println("3 - Acelerar");
            System.out.println("4 - Desacelerar");
            System.out.println("5 - Subir marcha");
            System.out.println("6 - Descer marcha");
            System.out.println("7 - Virar esquerda");
            System.out.println("8 - Virar direita");
            System.out.println("9 - Verificar velocidade");
            System.out.println("10 - Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = sc.nextInt();
            if (opcao == 1) {
                carro.ligar();
            }
            else if (opcao == 2) {
                carro.desligarCarro();
            }
            else if (opcao == 3) {
                carro.acelerarCarro();
            }
            else if (opcao == 4) {
                carro.desacelerarCarro();
            }
            else if (opcao == 5) {
                carro.subirMarcha();
            }
            else if (opcao == 6) {
                carro.descerMarcha();
            }
            else if (opcao == 7) {
                carro.virarEsquerda();
            }
            else if (opcao == 8) {
                carro.virarDireita();
            }
            else if (opcao == 9) {
                System.out.println("Velocidade atual: " + carro.verificarVelocidade() + " km/h");
            }
            else if (opcao == 10) {
                System.out.println("Saindo...");
            }
            else {
                System.out.println("Opcao invalida.");
            }
    }
    sc.close();
}
}
