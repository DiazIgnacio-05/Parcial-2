public class Cuenta {
    private double saldo;

    public Cuenta(double saldoInicial) { this.saldo = saldoInicial; }

    public void retirar(double monto) throws SaldoInsuficienteException {
        if (monto > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente", monto - saldo);
        }
        saldo -= monto;
    }

    public double getSaldo() { return saldo; }
}