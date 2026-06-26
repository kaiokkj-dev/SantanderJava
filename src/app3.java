import java.util.Scanner;

public class app3 {
    public static void main(String [] args) {
        try (var scanner = new Scanner(System.in)) {
        System.out.println("Informe seu nome: ");
        var name = scanner.next();
        System.out.println("Informe sua idade: ");
        var age = scanner.nextInt();
        System.out.println("Voce e emancipado? (s/n)");
        var isEmancipated = scanner.next().equalsIgnoreCase("s");

        if (age >= 18) {
            System.out.printf("%s, Voce tem %s anos e pode dirigir. \n", name, age);
        } else if (age >= 16 && isEmancipated) {
            System.out.printf("%s, Apesar de ter %s anos, voce e emancipado e pode dirigir. PARABENSSSS!!! \n", name, age);
        }
        else {
            System.out.printf("%s, Voce nao pode dirigir. \n", name);
        }
        System.out.println("Fim de execucao");
}
}
}