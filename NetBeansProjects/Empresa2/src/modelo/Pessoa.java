
package modelo;


public class Pessoa {
    //Atributos
    private String nome;
    private String endereco;
    private String telefone;
    
    //Construtores
    public Pessoa(){
       this.setNome("");
       this.setEndereco("");
       this.setTelefone("");
    }
    
    public Pessoa(String pNome, String pEndereco, String pTelefone){
        this.setNome(pNome);
        this.setEndereco(pEndereco);
        this.setTelefone(pTelefone);
    }
    
    public Pessoa(String pNome, String pTelefone){
        this.setNome(pNome);
        this.setTelefone(pTelefone);
        this.setEndereco("");
    }

    
    //Get's e Set's
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
