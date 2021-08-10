
package modelo;


public class Comprador {
    //Atributos
    private float Verba;
    
    //Construtores
    public Comprador(float pVerba){
        this.Verba = pVerba;
    }
    
    //Métodos
    public void compra(){
        System.out.println("Comprador está comprando");
    }
    
    
    //Get's e Set's
    public float getVerba() {
        return Verba;
    }

 
    public void setVerba(float Verba) {
        this.Verba = Verba;
    }
}