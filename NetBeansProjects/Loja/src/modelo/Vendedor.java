
package modelo;


public class Vendedor {
    //Atributos
    private float Comissao;
    
    //Construtores
    public Vendedor(float pComissao){
        this.Comissao = pComissao;
    }
    
    //Métodos
    public void vender(){
        System.out.println("Vendedor está vendendo");
    }
    
    //Get's e Set's
    public float getComissao() {
        return Comissao;
    }

    public void setComissao(float Comissao) {
        this.Comissao = Comissao;
    }
    
    
}
