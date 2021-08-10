
package execucao;
import modelo.Prato;
import modelo.Pedido;
import modelo.Restaurante;

public class Main {


    public static void main(String[] args) {
        Prato prato1 = new Prato("Pizza",20.99,500);
        Prato prato2 = new Prato("Lasanha",17.99,500);
        Prato prato3 = new Prato("Strogonoff",15.99,500);
        Prato prato4 = new Prato("Contra-filé",7.99,500);
        
        Pedido pedido1 = new Pedido(2);
        pedido1.incluirPrato(prato1);
        pedido1.incluirPrato(prato2);
 
        
        Pedido pedido2 = new Pedido(3);
        pedido2.incluirPrato(prato3);
        pedido2.incluirPrato(prato4);

        
        
        Restaurante restaurante1 = new Restaurante();
        
        
        restaurante1.cadastrarPedido(pedido1);
        pedido1.mostrarPedido();
        pedido1.CalcularQtdeCalorias();
        pedido1.emitirConta();
        
        restaurante1.cadastrarPedido(pedido2);
        pedido2.mostrarPedido();
        pedido2.CalcularQtdeCalorias();
        pedido2.emitirConta();
        
        restaurante1.mostrarPedidos();
    }
    
}
