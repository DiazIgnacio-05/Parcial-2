public class MainCuenta {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(5000.00);
        try {
            cuenta.retirar(2000.00);
            System.out.println("Retiro exitoso. Saldo: " + cuenta.getSaldo());
            cuenta.retirar(4000.00);                
        } catch (SaldoInsuficienteException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Faltan: " + e.getFaltante());
        } finally {
            System.out.println("Operacion finalizada");
        }
    }
}