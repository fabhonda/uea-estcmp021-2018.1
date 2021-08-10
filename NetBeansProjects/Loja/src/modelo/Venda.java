
package modelo;


public class Venda {
    //Atributos
   private Comprador c;
   private Vendedor v;
   private Produto p;
   
   //Construtores
   public Venda(Comprador pC, Vendedor pV, Produto pP){
       this.c = pC;
       this.v = pV;
       this.p = pP;
   }
   
   //Métodos
   public void concetrizaVenda(){
       System.out.println("Venda efetuada");
        getC().setVerba(getC().getVerba() - getP().getPreco());
        getV().setComissao(getV().getComissao() + getP().getPreco() * 0.1f);
        getP().vendido();
   }
   
    public void cancelaVenda(){
        
    }
    
    //Get's e Set's
    public Comprador getC() {
        return c;
    }

    public void setC(Comprador c) {
        this.c = c;
    }

    public Vendedor getV() {
        return v;
    }

    public void setV(Vendedor v) {
        this.v = v;
    }

    public Produto getP() {
        return p;
    }

    public void setP(Produto p) {
        this.p = p;
    }
   
}
