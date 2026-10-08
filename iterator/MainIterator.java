public class MainIterator {
    public static void main(String[] args) {
        RegistrarNumeros registro = new RegistrarNumeros();
        registro.IngresarNumero(10);
        registro.IngresarNumero(20);
        registro.IngresarNumero(30);
        registro.IngresarNumero(100);

        registro.obtenerInforme();
    }
}