package cinema;

public abstract class Ingresso {
    
    protected double valor;
    protected String nomeFilme;
    protected boolean dublado;

    public Ingresso(double valor, String nomeFilme, boolean dublado) {

        this.valor = valor;
        this.nomeFilme = nomeFilme;
        this.dublado = dublado;
    }
    public abstract double calcularValorReal();

    public void exibirInformacoes() {
        System.out.println("Filme " + nomeFilme);

        if (dublado) {
            System.out.println("Tipo: Dublado");
        } else {
            System.out.println("Tipo: Legendado");
        }
        System.out.println("Valor: R$ "+ calcularValorReal());
    }
}
