
package modelo;


public class Operario extends Empregado {
    //Atributos
    private double valorProducao;
    private double comissao;
    
    //Construtores
    public Operario(String pNome, String pEndereco, String pTelefone, int pCodigo, double pSalario, double pImposto, double pProducao, double pComissao){
        super(pNome, pEndereco, pTelefone, pCodigo, pSalario, pImposto);
        this.setValorProducao(pProducao);
        this.setComissao(pComissao);
       
    }
    
    //Métodos
    public double calcularSalario(){
        return(this.getSalBase() - (this.getSalBase()* this.getImposto()) + this.getComissao());
    } 
    
    //Get's e Set's
    public double getValorProducao() {
        return valorProducao;
    }

    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }
    
    public double getComissao(){
        return comissao;
    }
    
    public void setComissao(double comissao){
        this.comissao = comissao;
    }
    
}
