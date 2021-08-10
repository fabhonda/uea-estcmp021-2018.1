
package execucao;

import modelo.Agenda;
import modelo.Contato;


public class Execucao {

 
    public static void main(String[] args) {
      Agenda ag = new Agenda();
      
      Contato cont1 = new Contato("Aluno 1","1111-1111");
      Contato cont2 = new Contato("Aluno 2","2222-2222");
      Contato cont3 = new Contato("Aluno 3","3333-3333");
      
      ag.inserirDado(cont1);
      ag.inserirDado(cont2);
      ag.inserirDado(cont3);
      
      ag.listarDados();
      
       ag.consultarDado("Aluno 2");
       ag.consultarDado("aaaa");
    }
    
}
