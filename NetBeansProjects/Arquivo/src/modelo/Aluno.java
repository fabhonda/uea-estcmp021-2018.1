
package modelo;

import java.io.Serializable;


public class Aluno implements Serializable{
    //Atributos
    private String nome;
    private int idade;
    private double media;
    
    //Construtores
    public Aluno(String pNome, int pIdade, double pMedia){
        this.setNome(pNome);
        this.setIdade(pIdade);
        this.setMedia(pMedia);
    }
    
    public Aluno(){
        this.setNome("");
        this.setIdade(0);
        this.setMedia(0.0);
    }

    //Métodos
    public void mostrarDados(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Média: " + this.getMedia());
    }
    
    //Get's e Set's
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }
}
