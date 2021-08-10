
package modelo;


public class Administrador extends Empregado {
    //Atributos
    private double ajudaCusto;
    
    //Construtores
    public Administrador(String pNome, String pEndereco, String pTelefone, int pCodigo, double pSalario, double pImposto, double pAjuda){
        super(pNome, pEndereco, pTelefone, pCodigo, pSalario, pImposto);
        this.setAjudaCusto(pAjuda);
    }
    
    //Métodos
    public double calcularSalario(){
        return(this.getSalBase() - (this.getSalBase()* this.getImposto()) + this.getAjudaCusto());
    } 
    
    //Get's e Set's
    public double getAjudaCusto() {
        return ajudaCusto;
    }

    public void setAjudaCusto(double ajudaCusto) {
        this.ajudaCusto = ajudaCusto;
    }
}