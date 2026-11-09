public class Cajero{
private double saldo;
public Cajero(double saldo){this.saldo=saldo;}
public double getSaldo(){return saldo;}
public void extraer(double monto)throws ExtraccionInvalidaException {
if(monto<=0){throw new ExtraccionInvalidaException("Monto invalido" + monto);}
if(monto>saldo){throw new ExtraccionInvalidaException("Saldo insuficiente para extrar: " +monto);}
else{
saldo-=monto;
System.out.println("Extraccion: " +monto + " -Saldo: " +saldo);}
}
public static void main(String[] args) {
    Cajero c = new Cajero(1000);
    double[] montos = {500, -50, 2000, 300};      
    for (double m : montos) {                     
        try {
            c.extraer(m);                          
        } catch (ExtraccionInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Operacion finalizada");
        }
    }                                             
}
}