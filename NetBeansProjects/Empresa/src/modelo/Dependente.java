
package modelo;


public class Dependente {
    //Atributos
    private String nome;
    private String parentesco;
    
    //Construtores
    public Dependente(String pNome, String pParentesco){
        this.setNome(pNome);
        this.setParentesco(pParentesco);
    }
    
    //Métodos
    public void mostrarDados(){
        System.out.println("Nome Dep: " + this.getNome());
        System.out.println("Parentesco Dep: " + this.getParentesco());
    }
    
    //Get's e Set's
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }
}
