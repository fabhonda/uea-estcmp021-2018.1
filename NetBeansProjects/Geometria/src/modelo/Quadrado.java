
package modelo;

public class Quadrado {
    
    public double lado, area, perimetro;
    
    public Quadrado(double pLado){
        this.lado = pLado;
        this.calcularArea();
        this.calcularPerimetro();
    }
            
    public Quadrado(){
        this.lado = 0.0;
        this.area = 0.0;
        this.perimetro = 0.0;
    }
    
    public void calcularArea(){
        this.area = this.lado*this.lado;
    }
    
    public void calcularPerimetro(){
        this.perimetro = 4*this.lado;
    }
    
    public void imprimir(){
        System.out.println("O lado é: " + this.lado);
        System.out.println("A área é: " + this.area);
        System.out.println("O perímetro é: " + this.perimetro);
        System.out.println();
    }
    
}
