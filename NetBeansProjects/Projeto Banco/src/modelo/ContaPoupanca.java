
package modelo;


public class ContaPoupanca extends Conta {
    //Atributos
    private String dataAniversario;
    private double rendimentoMensal;

    //Construtores
    public ContaPoupanca(String pCodigo, double pSaldo, String pDataAbertura) {
        super(pCodigo, pSaldo, pDataAbertura);
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
