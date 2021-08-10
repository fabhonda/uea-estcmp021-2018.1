
package modelo;


public class Quadrado implements FiguraGeometrica {
    //Atributos
    private double lado;
    
    //Construtores
    public Quadrado(int pLado){
        this.setLado(pLado);
    }
    
    //Get's e Set's
    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    //Sobrescritas da Interface
    @Override
    public double getArea(){
        double area = 0;
        area = lado * lado;
        return area;
    }

    @Override
    public String getNomeFigura() {
        return "quadrado";
    }

    @Override
    public double getPerimetro() {
        double perimetro = 0;
        perimetro = lado * 4;
        return perimetro;
    }
}
