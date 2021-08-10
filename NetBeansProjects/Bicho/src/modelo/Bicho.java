
package modelo;


public abstract class Bicho {
    //Atributos
    private String nome;
    
    //Construtores
    public Bicho(){
        this.nome = "";
    }
    
    public Bicho(String pNome){
        this.setNome(pNome);
    }
    
    //Métodos
    abstract public String som();
    
    public void mostrarDados(){
        System.out.println("Nome: " + this.getNome());
    }

    //Get's e Set's
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
