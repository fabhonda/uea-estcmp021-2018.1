
package execucao;

import modelo.Empregado;
import modelo.Projetos;
import modelo.TrabalhaEm;
import modelo.Alocacao;


public class Main {


    public static void main(String[] args) {
        Alocacao alocar = new Alocacao();
        
        Empregado emp1 = new Empregado("Empregado 1", "111.111.111-11","1234-1","Rua 1, Casa 1");
        Empregado emp2 = new Empregado("Empregado 2", "222.222.222-22","1234-2","Rua 2, Casa 2");
        Empregado emp3 = new Empregado("Empregado 3", "333.333.333-33","1234-3","Rua 3, Casa 3");
        
        Projetos proj1 = new Projetos("Projeto de Robô","PRobô", "NuComp Robô", "EST");
        Projetos proj2 = new Projetos("Projeto de EAD", "EAD", "NuComp EAD", "ESO");
        Projetos proj3 = new Projetos("Projeto de Saúde","","","ESA");
        
        alocar.cadastraAlocacoes(emp1, proj1, "02/02/2018");
        alocar.cadastraAlocacoes(emp1, proj2, "04/04/2018");
        alocar.cadastraAlocacoes(emp1, proj3, "05/05/2018");
        alocar.cadastraAlocacoes(emp2, proj1, "06/06/2018");
        alocar.cadastraAlocacoes(emp2, proj2, "07/07/2018");
        alocar.cadastraAlocacoes(emp2, proj3, "08/08/2018");
        alocar.cadastraAlocacoes(emp3, proj1, "09/09/2018");
        alocar.cadastraAlocacoes(emp3, proj2, "10/10/2018");
        alocar.cadastraAlocacoes(emp3, proj3, "11/11/2018");
        
        /*
        TrabalhaEm assoc1 = new TrabalhaEm(emp1,proj1,"02/02/2018");
        TrabalhaEm assoc2 = new TrabalhaEm(emp1,proj2,"03/03/2018");
        TrabalhaEm assoc3 = new TrabalhaEm(emp1,proj3,"04/04/2018");
        TrabalhaEm assoc4 = new TrabalhaEm(emp2,proj1,"05/05/2018");
        TrabalhaEm assoc5 = new TrabalhaEm(emp2,proj2,"06/06/2018");
        TrabalhaEm assoc6 = new TrabalhaEm(emp2,proj3,"07/07/2018");
        TrabalhaEm assoc7 = new TrabalhaEm(emp3,proj1,"08/08/2018");
        TrabalhaEm assoc8 = new TrabalhaEm(emp3,proj2,"09/09/2018");
        TrabalhaEm assoc9 = new TrabalhaEm(emp3,proj3,"10/10/2018");
        */
        
        alocar.listarAlocacoes();
        
        System.out.println("--------------------------------------------------------");
        alocar.excluirAlocacao(emp1, proj1);
        alocar.listarAlocacoes();
        
               
         /*       
        assoc1.mostraDados();
        assoc2.mostraDados();
        assoc3.mostraDados();
        assoc4.mostraDados();
        assoc5.mostraDados();
        assoc6.mostraDados();
        assoc8.mostraDados();
        assoc9.mostraDados();
        */
        

    }
    
}
