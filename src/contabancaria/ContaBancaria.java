package contabancaria;

public class ContaBancaria {
    private double saldo;
    private final double chequeEspecial;
    private double chequeEspecialUsado;
    public ContaBancaria(double depositoInicial) {
        this.saldo = depositoInicial;
        if (depositoInicial <= 500) {
            this.chequeEspecial = 50;
        } else {
            this.chequeEspecial = depositoInicial * 0.5;
        }
    }
    public double consultarSaldo() {
        return saldo;
    }
    public double consultarChequeEspecial() {
        return chequeEspecial;
    }
    public void depositar(double valor) {
        saldo += valor;
        if (chequeEspecial > 0) {
            double taxa = chequeEspecialUsado * 0.20;
            double divida = chequeEspecialUsado + taxa;
            if (saldo >= divida) {
                saldo -= divida;
                chequeEspecialUsado = 0;
            }
        }
    }
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else if (valor <= saldo + (chequeEspecial - chequeEspecialUsado)) {
            double usado = valor - saldo;
            saldo = 0;
            chequeEspecialUsado += usado;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
    public void pagarBoleto(double valor) {
        sacar(valor);
    }
    public boolean verificarChequeEspecial() {
        return chequeEspecialUsado > 0;
    }
}
