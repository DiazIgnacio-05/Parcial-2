public class SaldoInsuficienteException extends Exception {
    private final double faltante;

    public SaldoInsuficienteException(String mensaje, double faltante) {
        super(mensaje);
        this.faltante = faltante;
    }

    public double getFaltante() { return faltante; }
}


