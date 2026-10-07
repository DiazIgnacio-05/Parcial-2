public class MainTelefono{
    public static void main(String[] arg){
        VerTelefono miTelefono = new VerTelefono();
        try{
        System.out.println("Ingresando formato numero");
        miTelefono.ValidadTelefono("5483333456789");
        }catch(NumeroTelefonoInvalidoException e){
            System.out.println("Error de formato:" + e.getMessage());
        }
    }
}