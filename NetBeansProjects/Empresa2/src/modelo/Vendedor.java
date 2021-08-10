
package modelo;


public class Vendedor extends Empregado {
    //Atributos
    private double valorVendas;
    private double comissao;
    
    //Construtores
    public Vendedor(String pNome, String pEndereco, String pTelefone, int pCodigo, double pSalario, double pImposto, double pVendas, double pComissao){
        super(pNome, pEndereco, pTelefone, pCodigo, pSalario, pImposto);
        this.setValorVendas(pVendas);
        this.setComissao(pComissao);
    }
    
    //Métodos
    public double calcularSalario(){
        return(this.getSalBase() - (this.getSalBase()* this.getImposto()) + this.getComissao());
    } 
    
    //Get's e Set's
    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
}
