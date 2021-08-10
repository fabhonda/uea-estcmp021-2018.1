
package modelo;


public class Contato {
    private String nome;
    private String fone;
    
    public Contato(){
        this.nome = "";
        this.fone = "";
    }
    
    public Contato(String pNome, String pFone){
        this.nome = pNome;
        this.fone = pFone;
    }
    
    public void mostrarDados(){    

        System.out.println("Nome: " + this.nome);
        System.out.println("Fone: " + this.fone);
    }
    
    public String getNome(){
        return this.nome;
    }
   
    public String getFone(){
        return this.fone;
    }
    
    public void setNome(String pNome){
        if (pNome.length() > 2){
        this.nome = pNome;
        }
    }
    public void SetFone(String pFone){
        this.fone = pFone;
    }
} 

