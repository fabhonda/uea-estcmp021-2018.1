
package execucao;
import modelo.Eletrodomestico;
import modelo.Televisor;
import modelo.Microondas;

public class Execucao {

   
    public static void main(String[] args) {
        Eletrodomestico e1 = new Eletrodomestico(true);
       
      // e1.imprimir();
      
        Televisor t1 = new Televisor(false, 24, 13, true, false);
      
     //  t1.imprimir();
     
        Microondas m1 = new Microondas(false, true);
        
        m1.imprimir();
    }
       
      
}
