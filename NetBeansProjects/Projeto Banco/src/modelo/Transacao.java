
package modelo;


public class Transacao {
    //Atributos
    private double valor;
    private String dataMovimentacao;
    private String destino;
    
    //Construtores
    public Transacao(){
        this.setValor(0);
        this.setDestino("");
        this.setDataMovimentacao("");
    }
    
    public Transacao(double pValor, String pDataMovimentacao, String pDestino){
        this.setValor(pValor);
        this.setDataMovimentacao(pDataMovimentacao);
        this.setDestino(pDestino);
    }
    
    public Transacao(double pValor, String pDataMovimentacao){
        this.setValor(pValor);
        this.setDataMovimentacao(pDataMovimentacao);
    }
    
    //Métodos
    public void mostrarTransacao(){
        
    }

    //Get's e Set's
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDataMovimentacao() {
        return dataMovimentacao;
    }

    public void setDataMovimentacao(String dataMovimentacao) {
        this.dataMovimentacao = dataMovimentacao;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
}
