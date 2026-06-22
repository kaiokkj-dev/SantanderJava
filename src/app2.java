import java.util.Scanner;

public class app2 {
    
    public static void main(String[] args) {
        try (var scanner = new Scanner(System.in)) {
            System.out.println(("informe o primeiro numero: "));
            var valor1 = scanner.nextInt();
            System.out.println(("informe o segundo numero: "));
            var valor2 = scanner.nextInt();
            System.out.printf("%s + %s = %s\n", valor1, valor2, valor1 + valor2);
        }
}
}