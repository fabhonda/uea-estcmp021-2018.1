
package modelo;


public class Microondas {
    public boolean ligado, portaFechada;
    
    
    
    
    public Microondas(boolean pLigado, boolean pPortaFechada){
        portaFechada = pPortaFechada;
        ligado = pLigado;
         if(portaFechada==true)
            abrirporta();
        else
            fecharporta();
         
        if(ligado==true)
            desligar();
        else
            ligar();
       
    }
   
    public void ligar(){
        if(portaFechada==true)
            ligado=true;
    }
    
    public void desligar(){
        ligado=false;
    }
    
    public void fecharporta(){
        portaFechada=false;
    }
    
    public void abrirporta(){
        portaFechada=true;
    }
    
    
    public void imprimir(){
        System.out.println("Microondas ligado? " + ligado);
        System.out.println("Porta fechada? " + portaFechada);
        if(portaFechada==true && ligado==true)
            System.out.println("Microondas ligado e pronto!");
        
    }
}
