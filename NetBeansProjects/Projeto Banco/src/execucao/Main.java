
package execucao;

import modelo.Agencia;
import modelo.Banco;
import modelo.Cliente;
import modelo.ContaCorrente;


public class Main {


    public static void main(String[] args) {
        Banco badresco = new Banco();
        Agencia a1 = new Agencia("ABC");
        badresco.cadastrarAgencia(a1);
        badresco.mostrarAgencias();
        
        
        
        
        Cliente c1 = new Cliente("012.123.234-45","Rua 1","João","1111-1111","12/05/97");
        c1.mostrarDadosCliente();
        c1.abrirContaCorrente(new ContaCorrente("Codigo",1.12,"21/01"));
    }
    
}
