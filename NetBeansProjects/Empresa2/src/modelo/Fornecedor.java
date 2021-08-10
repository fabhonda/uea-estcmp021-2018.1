
package modelo;


public class Fornecedor extends Pessoa {
    //Atributos
    private double valorCredito;
    private double valorDivida;
    
    //Construtores
    public Fornecedor(String pNome, String pEndereco, String pTelefone, double pDiv, double pCred){
        super(pNome, pEndereco, pTelefone);
        this.setValorCredito(pCred);
        this.setValorDivida(pDiv);
    }
    
    //Métodos
    public double obterSaldo(){
        return (this.getValorCredito() - this.getValorDivida());
    }
    
    //Get's e Set's
    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }
}
