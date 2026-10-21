public class MainExamen {
    public static void main(String[] args) {
    Examen miExamen = new Examen();
    try{
        System.out.println("== INGRESANDO NOTAS ==");
        miExamen.registrarNota(10);
        miExamen.registrarNota(7);
        miExamen.registrarNota(0);
        miExamen.registrarNota(11);
    }catch(NotaInvalidaException e ){
        System.out.println("Error!!! " + e.getMessage());
        }finally{
            System.out.println("Carga finalizada");
    }
}
}