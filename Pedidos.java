import java.util.ArrayList;
import java.util.Iterator;
public class Pedidos{
private ArrayList<Double> montos;
public Pedidos(){this.montos=new ArrayList<>();}
public void agregar(double monto){montos.add(monto);}
public int eliminarMenores(double limite){
int eliminados = 0;
Iterator<Double> it = montos.iterator();
while(it.hasNext()){
if(it.next()<limite){
it.remove();
eliminados++;}}
return eliminados;
}
public void informe(){
if(montos.isEmpty()){System.out.println("Sin pedidos");
return;}
int cantidad = 0;
double total = 0;
double mayor = 0;
Iterator<Double> it1 = montos.iterator();
while(it1.hasNext()){
double m = it1.next();
total+=m;
cantidad++;
if(m>mayor){mayor=m;}}
System.out.println("Cantidad: " + cantidad);
System.out.println("Total: " + total);
System.out.println("Mayor: " + mayor);
}
public static void main(String[] args){
Pedidos miPedido = new Pedidos();
double monto[] ={150, 40, 300, 20, 90};
for(double m : monto){
miPedido.agregar(m);}
miPedido.informe();
System.out.println("Eliminados: " + miPedido.eliminarMenores(50));
miPedido.informe();
}
}