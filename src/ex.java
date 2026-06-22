import java.util.Scanner;
public class ex {
    public static void main(String[] args) {
        try (var scanner = new Scanner(System.in)) {
        System.out.println("informe seu nome: ");
        String nome = scanner.next();
        System.out.println("informe o ano que voce nasceu: ");
        int anoNascimento = scanner.nextInt();
        int anoAtual = 2026;
        int idade = anoAtual - anoNascimento;
        System.out.printf("Olá %s sua idade é %d%n", nome, idade);
        scanner.close();
    }
}
}
