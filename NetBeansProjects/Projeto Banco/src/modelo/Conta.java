
package modelo;

import java.util.ArrayList;


public abstract class Conta {
    //Atributos
    private String codigo;
    private double saldo;
    private String dataAbertura;
    Agencia agencia;
    ArrayList<Transacao> historico;
    
    //Construtores
    public Conta(String pCodigo, double pSaldo, String pDataAbertura){
        this.setCodigo(pCodigo);
        this.setSaldo(pSaldo);
        this.setDataAbertura(pDataAbertura);
        historico = new ArrayList<Transacao>();
    }
    
    //Métodos
    /*
    public void creditar(ContaPoupanca cp,double valor){
        
        cp.setSaldo(getSaldo()-valor);
        
    }
    */
    public abstract void creditar(double valor, String dataMovimentacao);
    public abstract void debitar(double valor, String dataMovimentacao);
    public abstract void transferencia(double valor, String dataMovimentacao, String tipoConta, Cliente destinatario);

        
    

    //Get's e Set's
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getDataAbertura() {
        return dataAbertura;
    }

    public void setDataAbertura(String dataAbertura) {
        this.dataAbertura = dataAbertura;
    }
}
