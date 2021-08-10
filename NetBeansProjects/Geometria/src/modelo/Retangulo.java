
package modelo;


public class Retangulo {
    public double comprimento, largura, area, perimetro;
    
    
    public Retangulo(double pComprimento, double pLargura){
        comprimento = pComprimento;
        largura = pLargura;
        calcularArea();
        calcularPerimetro();
    }
    
    
    public void calcularArea(){
        area = comprimento * largura; 
        
    }
    
    public void calcularPerimetro(){
        perimetro = (2* comprimento) + (2*largura);
    }
    
    public void imprimir(){
        System.out.println("O comprimento é: " + comprimento);
        System.out.println("A largura é: " + largura);
        System.out.println("A área é: " + area);
        System.out.println("O perímetro é: " + perimetro);
        System.out.println();
    }
}
