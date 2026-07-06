import java.util.Scanner;

public class ex6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.next();

        System.out.print("Digite o tipo da sua conta (corrente, poupanca ou investimento): ");
        String tipo = sc.next();

        if (tipo.equals("corrente") ||
            tipo.equals("poupanca") ||
            tipo.equals("investimento")) {

            System.out.println("Bem-vindo(a), " + nome + "! Sua conta " + tipo + " esta pronta para uso.");
        } else {
            System.out.println("Tipo de conta invalido.");
        }

        sc.close();
    }
}