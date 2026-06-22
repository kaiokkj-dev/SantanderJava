import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe a base do retângulo: ");
        double base = scanner.nextDouble();
        System.out.print("Informe a altura do retângulo: ");
        double altura = scanner.nextDouble();
        double area = base * altura;
        System.out.println("A área do retângulo é: " + area);
        scanner.close();
    }
}
