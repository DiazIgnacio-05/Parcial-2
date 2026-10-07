public class MainEdad{
    public static void main(String[] arg){
        ValidadEdad miEdad = new ValidadEdad();
        try{
            System.out.println("Ingresando una edad de 140");
            miEdad.verEdad(140);
        }catch(EdadInvalidaException e){
            System.out.println("Error!! " + e.getMessage());
        }
    }
}