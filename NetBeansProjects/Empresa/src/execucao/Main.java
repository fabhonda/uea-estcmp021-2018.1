
package execucao;
import modelo.Funcionario;

public class Main {


    public static void main(String[] args) {
        Funcionario fun1 = new Funcionario("Maria","Vendedora","Mariazinha","fiha");
        fun1.mostrarDados();
        Funcionario fun2 = new Funcionario("João","Gerente");
        fun2.mostrarDados();
        
    }
    
}
