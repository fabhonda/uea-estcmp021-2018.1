
public class Execucao {
    
    public static void main(String[] args) {
        Gato cat1 = new Gato();
        
        Gato cat2 = new Gato();
        
        cat1.nome = "Tom";
        cat1.idade = 12;
        cat1.peso = 3.5f;
       
        cat2.nome = "Frajola";
        cat2.idade = 7;
        cat2.peso = 5.7f;
        
        cat1.fazeraniversario();
        System.out.println("");
        cat1.comer();
        System.out.println("");
        cat1.correr();
        System.out.println("");
        
        cat2.fazeraniversario(); 
        System.out.println("");
        cat2.comer();
        System.out.println("");
        cat2.correr();
        System.out.println("");
        
        cat1.mostrarDados();
        System.out.println("");
        cat2.mostrarDados();
      
        Cao dog1 = new Cao();
        Cao dog2 = new Cao();
        
        System.out.println("");
        dog1.nome = "Marley";
        dog1.porte = "medio";
        dog1.raca = "labrador";
        dog1.mostrarDados();
        
        System.out.println("");
        dog1.nome = "Scooby";
        dog1.porte = "grande";
        dog1.raca = "pastor alemão";
        dog1.mostrarDados();
        
        System.out.println();
        int y=0;
        for(int x=0;x<10;x++){
            y=x*x;
            System.out.print("y=" + y);
            System.out.println();
        }
        
        System.out.println();
        int z=0;
        int x=0;
        while (x<=10){
            z=x*x;
            System.out.print("z=" + z);
            System.out.println();
            x++;
            
        }
        
    }
    
}
