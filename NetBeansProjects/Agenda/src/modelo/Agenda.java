
package modelo;
import java.util.ArrayList;

public class Agenda {
    Contato[] dados1;
    int tam;
    ArrayList<Contato> dados;
    
    public Agenda(){
        dados1 = new Contato[20];
        this.tam=0;
        dados = new ArrayList<Contato>();
    }
    
    public void inserirDado(Contato obj){
        this.dados.add(obj);
        /*
        if(this.tam < 20){
        this.dados[this.tam]=obj;
        this.tam++;
        }
        else{
            System.out.println("Agenda LOTADA!!!");
        }
        */
    }
   
    public void consultarDado(String pessoa){
        boolean achou = false;
        for(int i=0; i< this.dados.size(); i++){
            if(pessoa.equals(this.dados.get(i).getNome())){
                this.dados.get(i).mostrarDados();
                achou=true;
            }
            if (!achou){
            System.out.println("Elemento não encontrado!!");
        }
     }
    }

    public void listarDados(){
        for(int i=0;i<this.dados.size();i++){
            this.dados.get(i).mostrarDados();
        }
    }
  
  }
