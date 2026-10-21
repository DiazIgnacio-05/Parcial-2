public class MainEdad{
    public static void main(String[] arg){
        ValidadEdad miEdad = new ValidadEdad();
        try{
            System.out.println("Ingresando Edades");
            miEdad.verEdad(40);
            miEdad.verEdad(140);
            miEdad.verEdad(30);
        }catch(EdadInvalidaException e){
            System.out.println("Error!! " + e.getMessage());
        }
    }
}