
package modelo;


public class Produto {
    //Atributos
    private float Preco;
    private int Tamanho;
    
    
   //Construtores
    public Produto(float pPreco, int pTamanho){
        this.Preco = pPreco;
        this.Tamanho = pTamanho;
    }
    
    //Métodos
    public void vendido(){
        System.out.println("Produto vendido");
    }

    public float getPreco() {
        return Preco;
    }

    //Get's e Set's
    public void setPreco(float Preco) {
        this.Preco = Preco;
    }

    public int getTamanho() {
        return Tamanho;
    }

    public void setTamanho(int Tamanho) {
        this.Tamanho = Tamanho;
    }
}
