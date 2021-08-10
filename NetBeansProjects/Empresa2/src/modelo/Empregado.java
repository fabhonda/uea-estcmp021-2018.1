
package modelo;


public class Empregado extends Pessoa{
    //Atributos
    private int codigoSetor;
    private double salBase;
    private double imposto;
    
    //Construtores
    public Empregado(){
        this.setCodigoSetor(0);
        this.setSalBase(0.0);
        this.setImposto(0.0);
    }
    
    public Empregado(String pNome, String pEndereco, String pTelefone, int pCodigo, double pSalario, double pImposto){
        super(pNome, pEndereco, pTelefone);
        this.setSalBase(pSalario);
        this.setImposto(pImposto);
        this.setCodigoSetor(pCodigo);
    }

    //Métodos
    public double calcularSalario(){
        return(this.getSalBase() - (this.getSalBase()* this.getImposto()));
    }    
    
    //Get's e Set's
    public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public double getSalBase() {
        return salBase;
    }

    public void setSalBase(double salBase) {
        this.salBase = salBase;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }
}
