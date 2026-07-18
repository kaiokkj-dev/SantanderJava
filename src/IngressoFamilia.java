public class IngressoFamilia  extends Ingresso{
    
    private int quantidadePessoas;
    public IngressoFamilia(
            double valor,
            String nomeFilme,
            boolean dublado,
            int quantidadePessoas) {
        super(valor, nomeFilme, dublado);
        this.quantidadePessoas = quantidadePessoas;
    }
    
    @Override
    public double calcularValorReal() {
        double valorTotal = valor * quantidadePessoas;
        if (quantidadePessoas > 3) {
            valorTotal -= valorTotal * 0.05;
        }
        return valorTotal;
    }

}
