
package modelo;


public class Mamifero extends Animal {
    //Atributos
    private String alimento;
    
    //Construtores
    public Mamifero(){
        super();
        this.setAmbiente("Terra");
    }
    
    public Mamifero(String pNome, double pComp, int pPatas, String pCor, String pAmbiente, double pVelocidade){
        super(pNome, pComp, pPatas, pCor, pAmbiente, pVelocidade);
    }
    
    //Métodos
    public void mostrarAlimento(){
        System.out.println("Alimento: " + this.getAlimento());
    }

    //Get's e Set's
    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }
}
