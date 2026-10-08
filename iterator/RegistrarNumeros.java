import java.util.ArrayList;
import java.util.Iterator;
public class RegistrarNumeros{
    private ArrayList<Integer> numeros;
    public RegistrarNumeros(){
        this.numeros = new ArrayList<>();
    }
    public void IngresarNumero(int numero){
        this.numeros.add(numero);
    }
    public void obtenerInforme(){
        int cantidad = 0;
        int sumaTotal = 0;

        Iterator<Integer> iterador = this.numeros.iterator();

        while(iterador.hasNext()) { 
            int numeroActual = iterador.next();
            cantidad++;
            sumaTotal=sumaTotal+numeroActual;
        }
        if(cantidad>0){
            double promedio = (double) sumaTotal / cantidad;
            System.out.println("Numeros registrados: " + cantidad);
            System.out.println("Suma total de los numeros registrados: " + sumaTotal);
            System.out.println("El promedio es: " + promedio);
        }
        else{
            System.out.println("No hay numeros registrados");
        }
    }
}