import java.util.ArrayList;
import java.util.Iterator;
public class RegistroNotas{
    private ArrayList<Double> notas;
    public RegistroNotas(){
        this.notas=new ArrayList<>();
    }
    public void agregarNota(double nota){
        this.notas.add(nota);
    }
    public void analizarRendimiento(){
        int aprobados = 0;
        int reprobados = 0;
        Iterator<Double> iterador = this.notas.iterator();
        while(iterador.hasNext()){
            double guardarNota = iterador.next();
            if(guardarNota>=6.0){
                aprobados+=1;
            }
            else {
                reprobados+=1;
            }
        }
        System.out.println("Aprobados: "+ aprobados +" Alumnos");
        System.out.println("Reprobados: "+ reprobados +" Alumnos");
    }
}