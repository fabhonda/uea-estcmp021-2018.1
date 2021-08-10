
package modelo;


public class Televisor {
    public boolean ligado;
    public int volume, canal, numeroCanais=10, volumeMaximo=50;
    public boolean canalAcima, volumeAcima;
    
    
    
public Televisor(boolean pLigado, int pVolume, int pCanal, boolean pCanalAcima, boolean pVolumeAcima){
    canalAcima = pCanalAcima;
    volumeAcima = pVolumeAcima;
    ligado = pLigado;
    volume = pVolume;
    canal = pCanal;
    if(ligado==true)
        desligar();
    else
        ligar();
        if(pCanalAcima==true)
            canalAcima();
        else
            canalAbaixo();
        if(pVolumeAcima==true)
            volumeAcima();
        else
            volumeAbaixo();
}    
    public void canalAcima(){
        if(canal>0 && canal<numeroCanais)
            canal++;
        if(canal==numeroCanais)
            System.out.println("Você está no canal máximo");
    }
    
    public void canalAbaixo(){
        if(canal>1 && canal<=numeroCanais)
            canal--;
        if(canal==1)
            System.out.println("Você está no canal mínimo");
    }
    
     public void volumeAcima(){
        if(volume>0 && volume<volume)
            volume++;
        if(volume==volumeMaximo)
            System.out.println("Você está no volume máximo");
    }
    
    public void volumeAbaixo(){
        if(volume>1 && volume<=volume)
            volume--;
        if(volume==1)
            System.out.println("Você está no volume mínimo");
    }
    
    public void ligar(){
        ligado=true;
    }
    
    public void desligar(){
        ligado=false;
    }
    
    public void imprimir(){
        System.out.println("Televisor ligado? " + ligado);
        System.out.println("Total de canais: " + numeroCanais);
        System.out.println("Total de volume: " + volumeMaximo);
        System.out.println("Canal acima? " + canalAcima);
        System.out.println("Aumentar volume? " + volumeAcima);
        System.out.println("Volume atual: " + volume);
        System.out.println("Canal atual: " + canal);
        System.out.println();
    }
}
