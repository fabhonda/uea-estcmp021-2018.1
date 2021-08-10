
package modelo;


public class Fone {
    //Atributos
    private String numero;
    private int DDD;

    //Construtores
    public Fone(String pNumero, int pDDD){
        this.setNumero(pNumero);
        this.setDDD(pDDD);
    }
    
    //Get's e Set's
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getDDD() {
        return DDD;
    }

    public void setDDD(int DDD) {
        this.DDD = DDD;
    }
}
