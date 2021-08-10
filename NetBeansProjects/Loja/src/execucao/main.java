
package execucao;

import modelo.Produto;
import modelo.Comprador;
import modelo.Vendedor;
import modelo.Venda;


public class main {

    public static void main(String[] args) {
        
        Produto p1 = new Produto(100.0f,5);
        Produto p2 = new Produto(150.0f,55);
        Produto p3 = new Produto(20.0f,7);
        
        Vendedor v1 = new Vendedor(0);
        Vendedor v2 = new Vendedor(100);
        
        Comprador c1 = new Comprador(400);
        Comprador c2 = new Comprador(600);
        
        Venda venda1 = new Venda(c2,v1,p3);
        venda1.concetrizaVenda();
        
    }
    
}
