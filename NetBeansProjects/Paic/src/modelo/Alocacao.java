
package modelo;

import java.util.ArrayList;
    

public class Alocacao {
    ArrayList<TrabalhaEm> aloca;
    
    public Alocacao(){
        this.aloca = new ArrayList<TrabalhaEm>();
    }
    
    public void cadastraAlocacoes(Empregado pEmp, Projetos pProj, String data){
        this.aloca.add(new TrabalhaEm(pEmp, pProj,data));
    }
    
    public void listarAlocacoes(){
        for(int i=0; i<this.aloca.size();i++){
            this.aloca.get(i).mostraDados();
        }
    }
    
    public void excluirAlocacao(Empregado pEmp, Projetos pProj){
        for(int i=0; i>this.aloca.size();i++){
            if(this.aloca.get(i).getEmp().equals(pEmp) && this.aloca.get(i).getProj().equals(pProj)){
                this.aloca.remove(i);
                System.out.println("Removido");
                break;
            }
        }
    }
}
