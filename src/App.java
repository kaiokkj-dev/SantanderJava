import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o seu nome:");
        String nome = scanner.next();
        System.out.println("Informe sua idade:");
        int idade = scanner.nextInt();
        System.out.printf("Olá %s sua idade é %d%n", nome, idade);
        scanner.close();
    }
}