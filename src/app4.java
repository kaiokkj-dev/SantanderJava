import java.util.Scanner;

public class app4 {
    
    public static void main (String[] args) {
        try (var scanner = new Scanner(System.in)) {
        System.out.println("informe um numero de um 1 a 6");
        var option = scanner.nextInt();
        switch (option) {
            case 1:
                System.out.println("Brasil vai ganhar a Copa do mundo!");
                break;
                    case 2:
                System.out.println("Brasil vai ganhar o Hexa esse ano com gol do ENDRICK na final!");
                break;
                    case 3:
                System.out.println("Brasil vai ganhar o Hexa esse ano com gol do NEYMAR na final!");
                break;
                    case 4:
                System.out.println("Brasil vai PERDER a Copa do mundo na final para FRANCA!");
                break;
                    case 5:
                System.out.println("Sim, O Brasil vai chegar na FINAL da Copa do mundo! aeeeeeeeee");
                break;
            default:
                System.out.println("Opcao inexistente!");
                break;
        }
}
}
}
