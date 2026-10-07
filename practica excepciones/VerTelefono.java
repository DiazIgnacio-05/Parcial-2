public class VerTelefono{
    private String telefono;
    public String getTelefono(){return this.telefono;}
    public void ValidadTelefono(String telefono) throws NumeroTelefonoInvalidoException{
        int cantidad = 13;
        String formatoCorrecto = "+54 9 38 34404734";
        boolean longitudInvalida = telefono.length() != cantidad;
        boolean prefijoInvalido = !telefono.startsWith("549");
        if(longitudInvalida || prefijoInvalido){
            throw new NumeroTelefonoInvalidoException("El numero de telefono no cumple con el formato: " + telefono + ". Ejemplo de formato correcto: " + formatoCorrecto);
        }else{
            System.out.println("El numero de telefono es valido");
        }
    }
}