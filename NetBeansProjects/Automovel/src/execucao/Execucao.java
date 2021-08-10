
package execucao;

import modelo.Moto;

public class Execucao {

   
    public static void main(String[] args) {
        Moto m1 = new Moto("Marca 1", "Modelo 1", "Azul", true, 3);
        Moto m2 = new Moto("Marca 2", "Modelo 2", "Vermelho", false, 2);
        Moto m3 = new Moto("Marca 3", "Modelo 3", "Verde", true, 2);
        Moto m4 = new Moto("Marca 4", "Modelo 4", "Branco", true, 2);
        
        m1.imprimir();
        m2.imprimir();
        
        
    }
    
}
