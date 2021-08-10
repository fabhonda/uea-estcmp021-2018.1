

package modelo;

public class Eletrodomestico {
    public boolean ligado;
    
    
    
 public Eletrodomestico(boolean pLigado){
     ligado = pLigado;
     if(ligado==true)
         desligar();
     else
         ligar();
 }
 
 public void ligar(){
     ligado=true;
 }
 
 public void desligar(){
     ligado=false;
 }
 public void imprimir(){
     System.out.println("Está ligado? " + ligado);
 }
}
