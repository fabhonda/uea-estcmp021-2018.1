
package modelo;

import java.util.ArrayList;


public class Restaurante {
    //Variáveis
    ArrayList<Pedido> pedidos;
    
    //Construtores
    public Restaurante(){
        this.pedidos = new ArrayList<Pedido>();
    }

    //Métodos
    public void cadastrarPedido(Pedido obj){
        this.pedidos.add(obj);
        }
    
    public void removerPedido(Pedido obj){
        this.pedidos.remove(obj);
    }
    
    public void mostrarPedidos(){
        for(int i=0; i<this.pedidos.size();i++){
            this.pedidos.get(i).mostrarPedido();
        }
    }

}
