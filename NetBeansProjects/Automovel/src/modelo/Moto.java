
package modelo;


public class Moto {
    public String marca, modelo, cor; 
    public int marcha, menorMarcha=0, maiorMarcha=5;
    boolean ligado;
    
    
    public Moto(String pMarca, String pModelo, String pCor, boolean pLigado, int pMarcha){
        ligado = pLigado;   
        cor = pCor;
        modelo = pModelo;
        marca = pMarca;
        marcha = pMarcha;
        if(ligado == true)
            desligar();
        else
            ligar();
        marchaAcima();
        marchaAbaixo();
       
    }
    
    public void marchaAcima(){
        if(ligado==true){
            if(marcha>=menorMarcha && marcha<maiorMarcha){
            marcha++;
        }
        if(ligado==false){
            marcha=0;
        }
    }
   }
    
    public void marchaAbaixo(){
        if(ligado==true){
            if(marcha<=maiorMarcha && marcha>menorMarcha){
             marcha--;
            }
        }
        if(ligado==false){
            marcha=0;
        }
    }
    public void ligar(){
        ligado = true;
    }   
    public void desligar(){
        ligado = false;
    }
    public void imprimir(){
        System.out.println("A marca é: " + marca);
        System.out.println("O modelo é: " + modelo);
        System.out.println("A cor é: " + cor);
        System.out.println("Moto ligada? " + ligado);
        System.out.println("A marcha é: " + marcha);
        System.out.println();
    }
}
    
    

