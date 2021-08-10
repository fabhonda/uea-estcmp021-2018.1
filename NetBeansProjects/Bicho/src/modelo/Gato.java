
package modelo;


public class Gato extends Bicho {
    
    //Construtores
    public Gato(){
        super();
    }
    
    public Gato(String pNome){
        super(pNome);
    }
    
    //Sobreescrita
    @Override
    public String som() {
        return("Miau");
    }
    
    
}
