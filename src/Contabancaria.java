
import javax.lang.model.util.ElementScanner14;

public class ContaBancaria {
    private double saldo;
    private double chequeEspecial;
    private double chequeEspeciaUsado;

        public ContaBancaria(double depositoInicial) {
        this.saldo = depositoInicial;
        if(depositoInicial <= 500) {
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
    saldo =+ valor;
}
public void sacar(double valor) {
    if (valor <= saldo) {
        saldo -= valor;
    } else if (valor <= saldo + chequeEspecial) {
        double usado = valor - saldo;
        saldo = 0;
        chequeEspecial = usado;
    } else {
        System.out.println("Saldo insuficiente!");
    }
}
}