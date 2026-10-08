public class MainNotas{
    public static void main(String[] args) {
        RegistroNotas registro = new RegistroNotas();

        registro.agregarNota(7.00);
        registro.agregarNota(2.00);
        registro.agregarNota(10.00);
        registro.agregarNota(4.00);
        registro.agregarNota(6.00);

        registro.analizarRendimiento();
    }
}