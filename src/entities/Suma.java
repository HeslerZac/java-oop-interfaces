package entities;
import interfaces.*;

public class Suma implements 
Operacion, Mostrable, Registrable {
    public double calcular(double a,double b) {
        return a + b;
    }
    
    public void mostrar (double r){
        System.out.println("Suma: 0"+ r);
    }
    
    public void registrar(double a, double b, double r){
        
        System.out.println(a +" + "+ b + " = "+ r );
    }
    
}

