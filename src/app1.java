import java.util.Scanner;

public class app1 {

    public static void main(String [] args) {
        try (var scanner = new Scanner(System.in)) {
            System.out.println("Quantos anos vc tem?");
            var age = scanner.nextInt();
            System.out.println("Vc e emancipado?");
            var IsEmancipated = scanner.nextBoolean();
            var liberado = age >= 18 || (IsEmancipated && age >= 16);
            System.out.printf("Vc pode dirigir? %b%n", liberado);
        }
    }
}