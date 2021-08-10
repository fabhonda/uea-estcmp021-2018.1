
package execucao;

import modelo.Peixe;
import modelo.Mamifero;
import modelo.Animal;


public class Main {


    public static void main(String[] args) {
        
        
        Peixe p1 = new Peixe("Peixe-palhaço",0.10,"branco/laranja","mar",1.56);
        p1.addCaracteristica("Colorido");
        p1.addCaracteristica("Lento");
        Mamifero m1 = new Mamifero("Homem",1.60,2,"branco","terra",4);
        m1.setAlimento("Bife com batata frita, feijão preto e farofa");
        Peixe p2 = new Peixe("Tucunaré",0.50,"preto/amarelo/verde","rio",2.6);
        p2.addCaracteristica("Saboroso");
        Mamifero m2 = new Mamifero("Boi1",2.3,4,"marrom","terra",1.0);
        m2.setAlimento("Capim");
        
        p1.mostrarDados();
        p2.mostrarCaracteristicas();
        System.out.println();
        
        m1.mostrarDados();
        m1.mostrarAlimento();
        System.out.println();
        
        p2.mostrarDados();
        p2.mostrarCaracteristicas();
        System.out.println();
        
        m2.mostrarDados();
        m2.mostrarAlimento();
        System.out.println();
    }
    
}
