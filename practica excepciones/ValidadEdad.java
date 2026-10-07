public class ValidadEdad{
    private int edad;
    public int getEdad(){return this.edad;}
    public void verEdad(int edad) throws EdadInvalidaException{
        if(edad<0 || edad>130){
            throw new EdadInvalidaException ("No se ha podido validar la edad");
        } else{
            System.out.println("La edad se valido correctamente");
        }
    }
}