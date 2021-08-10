
package modelo;


public class Professor extends Pessoa{
    //Atributos
    private String titulacao;
    
    //Construtores
    public Professor(String pNome, String pCpf, String pTitulo){
        super(pNome, pCpf);
        this.titulacao = pTitulo;
    }
    
    //Métodos
    public void corrigirProva(){
        System.out.println(this.getNome() + " está corrigindo prova");
    }

    //Get's e Set's
    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }
}
