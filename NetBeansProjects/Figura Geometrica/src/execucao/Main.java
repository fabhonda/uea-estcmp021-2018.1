
package execucao;

import modelo.Quadrado;
import modelo.Triangulo;


public class Main {


    public static void main(String[] args) {
        Quadrado q1 = new Quadrado(5);
        Triangulo t1 = new Triangulo(3,2,3,3,3);
        
        System.out.println(q1.getNomeFigura());
        System.out.println(q1.getPerimetro());
        System.out.println(q1.getArea());
        System.out.println();
        
        System.out.println(t1.getNomeFigura());
        System.out.println(t1.getPerimetro());
        System.out.println(t1.getArea());
        System.out.println();
    }
    
}
