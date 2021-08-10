
package modelo;


public class Circulo {
    private double raio, area, perimetro;
    
    public Circulo(double pRaio){
        this.raio = pRaio;
        this.calcularArea();
        this.calcularPerimetro();
    }
    
    public void calcularArea(){
        area = (Math.PI*raio*raio);
    }
    
    public void calcularPerimetro(){
        perimetro = (Math.PI*raio*2);
    }
    
    public void imprimir(){
        System.out.println("O raio é: " + raio);
        System.out.println("A área é: " + area);
        System.out. println("O perímetro é: " + perimetro);
        System.out.println();
    }
    
    public double getArea(){
        return this.area;
    }
    
    public double getPerimetro(){
        return this.perimetro;
    }
    
    public double getRaio(){
        return this.raio;
    }
   
    public void setRaio(double pRaio){
        this.raio = pRaio;
        this.calcularArea();
        this.calcularPerimetro();
    }
    
    
   
}
