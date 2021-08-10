
package modelo;

import java.util.ArrayList;


public class Banco {
    //Atributos
    ArrayList<Agencia> agencias;
    
    //Construtores
    public Banco(){
        this.agencias = new ArrayList<Agencia>();
    }
    
    //Métodos
    public void cadastrarAgencia(Agencia obj){
        this.agencias.add(obj);
    }
    
    public void excluirAgencia(Agencia obj){
        this.agencias.remove(obj);
    }
    
    public void mostrarAgencias(){
        System.out.println("-----------[AGÊNCIAS]-----------");
        for(int i=0; i<this.agencias.size();i++){
            System.out.println("Agência: " + this.agencias.get(i).getCodigo());
        }
        System.out.println();
    }
}
