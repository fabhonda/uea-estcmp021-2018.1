
package execucao;

import modelo.Bicho;
import modelo.Gato;
import modelo.Cachorro;


public class Main {


    public static void main(String[] args) {
       //Bicho b1 = new Bicho("Fred");
       
       Gato g1 = new Gato("Tom");
       Cachorro c1 = new Cachorro("Fred");
       
       System.out.println(g1.som());
       System.out.println(c1.som());
       
       Bicho[] bs = new Bicho[2];
       bs[0] = new Gato("Fred");
       bs[1] = new Cachorro("Shalon");
       
       for(int i=0; i<bs.length;i++){
           System.out.println(bs[i].som());
       }
    }
    
}
