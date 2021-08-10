
package modelo;


public class Pessoa {
    //Atributos
    private String nome;
    private String cpf;
    
    //Construtores
    public Pessoa(String pNome, String pCpf){
        this.setNome(pNome);
        this.setCpf(pCpf);
}
    //Métodos
    public void respirar(){
        System.out.println(this.nome + " Pessoa está respirando!!");
    }
    
    public String obterDadosPessoa(){
        return this.getNome() + " " + this.getCpf();
    }

    //Get's e Set's
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
