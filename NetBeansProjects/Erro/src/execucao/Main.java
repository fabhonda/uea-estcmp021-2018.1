
package execucao;

import java.io.FileReader;


public class Main {


    public static void main(String[] args) {
        //Array index out of bonds
        int numeros[] = {1,2,3};
        System.out.println(numeros[0]);
        System.out.println(numeros[1]);
        System.out.println(numeros[2]);
        
        try{
            System.out.println(numeros[3]);
    }
        catch(Exception e){    
            
    }
        System.out.println("Terminou o programa!!");
        
        
        //File wasn't found
        try{
            FileReader read = new FileReader("Teste.txt");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        
        //Aritmethic Error: 0 division
        int i = 5571;
        try{
        i = i/0;
        } catch(Exception e){
        System.out.println("Resultado de i: " + i);
        }
}
}
