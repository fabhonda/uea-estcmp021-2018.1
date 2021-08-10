
package execucao;

import modelo.Pessoa;
import modelo.Administrador;
import modelo.Empregado;
import modelo.Fornecedor;
import modelo.Operario;
import modelo.Vendedor;

public class Main {


    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Pessoa1","Rua1 ","1111-1111");
        Fornecedor f1 = new Fornecedor("Fornecedor 1","Rua 2 ", "222-222", 50.0, 100.00);
        Empregado e1 = new Empregado("Empregado1","Rua emp1","333-333",4,1000,0.10);
        Administrador a1 = new Administrador("Adm1","Rua adm1","333-333",4,1000,0.10,20);
        
        System.out.println("Salário do Empregado: " + e1.calcularSalario());
        System.out.println("Salário do Administrador: " + a1.calcularSalario());
        //System.out.println("Saldo do Fornecedor: " + f1.obterSaldo());
        
        
        if(a1 instanceof Pessoa){
            System.out.println(a1.getNome() + " é uma Pessoa");
        }else{
            System.out.println(a1.getNome() + " não é uma Pessoa");
        }
        
        /*
        if(e1 instanceof Pessoa){
            System.out.println(e1.getNome() + " é uma Pessoa");
        }else{
            System.out.println(e1.getNome() + " não é uma Pessoa");
        }

        if(p1 instanceof Fornecedor){
            System.out.println(p1.getNome() + " é um Fornecedor");
        }else{
            System.out.println(p1.getNome() + " não é um Fornecedor");
        }
        
         if(f1 instanceof Pessoa){
            System.out.println(f1.getNome() + " é uma Pessoa");
        }else{
            System.out.println(f1.getNome() + " não é uma Pessoa");
        }
         */
    }
}
