
package modelo;


public class Prato {
    //Variáveis
    private String descricao;
    private double preco;
    private int calorias;
    
    //Construtores
    public Prato(){
        this.descricao = "";
        this.preco = 0;
        this.calorias = 0;
    }
    
    public Prato(String pDescricao, double pPreco, int pCalorias){
        this.descricao = pDescricao;
        this.preco = pPreco;
        this.calorias = pCalorias;
    }
        
   //Métodos
   public void mostrarPratos(){
       System.out.println("Nome: " + this.descricao);
       System.out.println("Preço: " + this.preco);
       System.out.println("Calorias: " + this.calorias);
       System.out.println();
   }
   
   //Get's e Set's
   public String getDescricao(){
       return this.descricao;
   }
   
   public void setDescricao(String descricao){
       this.descricao = descricao;
   }
   
   public double getPreco(){
       return this.preco;
   }
   
   public void setPreco(double preco){
       this.preco = preco;
   }
   
   public int getCalorias(){
       return this.calorias;
   }
   
   public void setCalorias(int calorias){
       this.calorias = calorias;
   }
        
}
