package cinema;

public class Cinema {
    public static void main(String[] args) {
        Ingresso ingressoMeia = new MeiaEntrada(
                40,
                "Superman",
                true
        );
        Ingresso ingressoFamilia = new IngressoFamilia(
                40,
                "Batman",
                false,
                4
        );
        System.out.println("===== MEIA ENTRADA =====");
        ingressoMeia.exibirInformacoes();
        System.out.println();
        System.out.println("===== INGRESSO FAMILIA =====");
        ingressoFamilia.exibirInformacoes();
    }
}
