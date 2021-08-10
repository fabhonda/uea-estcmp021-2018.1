
import java.util.Date;


public class ContaBancaria {
    double saldo;
    Date dataAbertura;
    String tipoConta;
    double valorManutencao;
    
    String getDataAberturaFormata(){
        return null;
    }
    
    double getSaldo(){
        return this.saldo;
    }
    
    double depositar(double saldo){
        return saldo++;
    }
    
    double sacar(double saldo){
        return saldo--;
    }

}