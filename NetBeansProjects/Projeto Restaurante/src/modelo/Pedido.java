
package modelo;

import java.util.ArrayList;


public class Pedido {
    //Variáveis
    private int mesa;
    ArrayList<Prato> pratos;
    private double totalpreco;
    private int totalcalorias;
    
    //Construtores
    public Pedido(){
        this.mesa = 0;
        this.pratos = new ArrayList<Prato>();
    }
    
    public Pedido(int pMesa){
        this.mesa = pMesa;
        this.pratos = new ArrayList<Prato>();
    }
    
    //Métodos
    public void incluirPrato(Prato obj){
        this.pratos.add(obj);
    }
    
    public void removerPrato(Prato obj){
        this.pratos.remove(obj);
    }
    
    public void emitirConta(){
        for(int i=0; i<this.pratos.size();i++){
           this.totalpreco += this.pratos.get(i).getPreco();
        }
        System.out.println("O preço total é: " + this.totalpreco);
        System.out.println();
    }
    
    public void mostrarPedido(){
        for(int i=0; i<this.pratos.size();i++){
            this.pratos.get(i).mostrarPratos();
        }
    }
    
    public void CalcularQtdeCalorias(){
        for(int i=0; i<this.pratos.size();i++){
            this.totalcalorias += this.pratos.get(i).getCalorias();
        }
        System.out.println("A quantidade de calorias total é: " + this.totalcalorias);
    }
}
