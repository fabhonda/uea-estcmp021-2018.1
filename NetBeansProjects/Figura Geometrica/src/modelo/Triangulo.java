
package modelo;


public class Triangulo implements FiguraGeometrica {
    //Atributos
    private double base;
    private double altura;
    private double ladoA;
    private double ladoB;
    private double ladoC;
    
    //Construtores
    public Triangulo(double pBase, double pAltura, double pLa, double pLb, double pLc){
        this.setBase(pBase);
        this.setAltura(pAltura);
        this.setLadoA(pLa);
        this.setLadoB(pLb);
        this.setLadoC(pLc);
    }
 
    //Get's e Set's
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }

    //Sobrescritas da Interface
    @Override
    public String getNomeFigura() {
        return "triangulo";
    }

    @Override
    public double getArea() {
        return ((this.getBase()*this.getAltura())/2.0);
    }

    @Override
    public double getPerimetro() {
        return (this.getLadoA()+this.getLadoB()+this.getLadoC());
    }
}
