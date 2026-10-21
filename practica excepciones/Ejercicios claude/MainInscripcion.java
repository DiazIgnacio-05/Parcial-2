public class MainInscripcion {
    public static void main(String[] args) {
        Materia[] materias = {
            new Materia("Programacion II", 1),
            new Materia("Fisica III", 5)
        };
        Inscripcion inscripcion = new Inscripcion(materias);

        String[] pedidos = {"Fisica III", "Programacion II", "Programacion II", "Algebra"};
        for (String pedido : pedidos) {
            try {
                inscripcion.inscribir(pedido);
            } catch (CupoCompletoException e) {
                System.out.println("Cupo: " + e.getMessage());
            } catch (MateriaInexistenteException e) {
                System.out.println("Materia: " + e.getMessage());
            } finally {
                System.out.println("Fin de la inscripcion");
            }
        }
    }
}