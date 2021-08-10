
package modelo;

import java.util.ArrayList;


public class Peixe extends Animal{
    //Atributos
    ArrayList<String> caracteristicas = new ArrayList<String>();
            
    //Construtores
    public Peixe(){
        super();
        this.setPatas(0);
        this.setAmbiente("mar");
        this.setCor("cinzenta");
        
    }
    
    public Peixe(String pNome, double pComp, String pCor, String pAmbiente, double pVelocidade){
        super(pNome, pComp, 0, pCor, pAmbiente, pVelocidade);
    }
    
    //Métodos
    public void addCaracteristica(String pCar){
        this.caracteristicas.add(pCar);
    }
    
    public void mostrarCaracteristicas(){
        for(int i=0; i< this.caracteristicas.size(); i++){
            System.out.println(this.caracteristicas.get(i));
        }
    }
    
    public void excluirCaracteristicas(String pCar){
        this.caracteristicas.remove(pCar);
    }
}
