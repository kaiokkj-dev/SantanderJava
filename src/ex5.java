import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua altura: ");
        double altura = scanner.nextDouble();
        System.out.print("Digite seu peso: ");
        double peso = scanner.nextDouble();
        double imc = peso / (altura * altura);
if (imc < 18.5) {
    System.out.printf("Seu IMC é %.2f. Você está ABAIXO DO PESO!%n", imc);
} else if (imc < 25) {
    System.out.printf("Seu IMC é %.2f. Você está no PESO IDEAL!%n", imc);
} else if (imc < 30) {
    System.out.printf("Seu IMC é %.2f. Você está LEVEMENTE ACIMA DO PESO!%n", imc);
} else if (imc < 35) {
    System.out.printf("Seu IMC é %.2f. Você está em OBESIDADE GRAU I!%n", imc);
} else if (imc < 40) {
    System.out.printf("Seu IMC é %.2f. Você está em OBESIDADE GRAU II!%n", imc);
} else {
    System.out.printf("Seu IMC é %.2f. Você está em OBESIDADE GRAU III (MÓRBIDA)!%n", imc);
}
        scanner.close();
    }
}