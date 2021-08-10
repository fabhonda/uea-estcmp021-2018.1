
package modelo;

public class Empregado {
    private String nome;
    private String cpf;
    private String rg;
    private String endereco;
    
    public Empregado(){
        this.nome = "";
        this.cpf = "";
        this.rg = "";
        this.endereco = "";
    }
    
    public Empregado(String pNome, String pCpf, String pRg, String pEndereco){
        this.nome = pNome;
        this.cpf = pCpf;
        this.rg = pRg;
        this.endereco = pEndereco;
    }
    
    public void mostraDados(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Cpf: " + this.getCpf());
        System.out.println("RG: " + this.getRg());
        System.out.println("Endereço: " + this.getEndereco());
    }
    
    
    String getNome(){
        return this.nome;
    }
    
    String getCpf(){
        return this.cpf;
    }
    
    String getRg(){
        return this.rg;
    }
    
    String getEndereco(){
        return this.endereco;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    public void setRg(String rg){
        this.rg = rg;
    }
    
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
}

