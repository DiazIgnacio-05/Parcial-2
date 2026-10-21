public class Examen{
    public void registrarNota(int nota1)throws NotaInvalidaException{
        if(nota1<1 || nota1 >10 ){
            throw new NotaInvalidaException("Nota invalida: " + nota1 + " (debe estar entre 1 y 10)");
        } else{
            System.out.println("Nota cargada: " + nota1);
        }
    }
}