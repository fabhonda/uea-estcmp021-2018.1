
package modelo;


public class Engenheiro extends Pessoa {
    //Atributos
    private String numCREA;
    
    //Construtores
    public Engenheiro(String pNome, String pCpf, String pNumCREA){
        super(pNome,pCpf);
        this.numCREA = pNumCREA;
    }
    
    //Métodos
    public void respirar(){
        System.out.println(this.getNome() + " Engenheiro está respirando!!");
    }
        
    public void projetar(){
        System.out.println(this.getNome() + " " + this.getCpf() + " está projetando");
    }
    
    public void emitirAvaliacaoTecnica(){
        System.out.println(this.getNome() + " " + this.getNumCREA() + " está emitindo avaliação técnica!!");
    }
    
    //Get's e Set's
    public String getNumCREA() {
        return numCREA;
    }

    public void setNumCREA(String numCREA) {
        this.numCREA = numCREA;
    }
}
