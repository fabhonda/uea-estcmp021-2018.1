
package modelo;


public class ContaCorrente extends Conta {
    //Atributos
    private double valorManutencao;

    //Construtores
    public ContaCorrente(String pCodigo, double pSaldo, String pDataAbertura) {
        super(pCodigo, pSaldo, pDataAbertura);
    }
    

    //Get's e Set's
    public double getValorManutencao() {
        return valorManutencao;
    }

    public void setValorManutencao(double valorManutencao) {
        this.valorManutencao = valorManutencao;
    }

    @Override
    public void creditar(double valor, String dataMovimentacao) {
        this.setSaldo(getSaldo() - valor);
    }

    @Override
    public void debitar(double valor, String dataMovimentacao) {
        this.setSaldo(getSaldo() + valor);
    }

    @Override
    public void transferencia(double valor, String dataMovimentacao, String tipoConta, Cliente destinatario) {
        this.creditar(valor, dataMovimentacao);
        
    }
    
}