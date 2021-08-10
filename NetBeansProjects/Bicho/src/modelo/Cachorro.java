
package modelo;


public class Cachorro extends Bicho {
    
    //Construtores
    public Cachorro(){
    super();    
    }
    
    public Cachorro(String pNome){
        super(pNome);
    }
    
    //Sobreescrita
    @Override
    public String som() {
        return("AuAu");
    }
    
}
