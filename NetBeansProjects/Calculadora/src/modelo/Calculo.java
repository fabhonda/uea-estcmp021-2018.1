
package modelo;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;
import static java.lang.Math.log10;

public class Calculo {
    public double a;
    public double b;
    
    public Calculo(double a, double b){
        this.a = a;
        this.b = b;
        soma(this.a,this.b);
        subtracao(this.a,this.b);
        multiplicacao(this.a,this.b);
        divisao(this.a,this.b);
        exponenciacao(this.a,this.b);
        raizquadrada(this.a);
        raizquadrada(this.b);
        geraRandomico(this.a,this.b);
        log(this.a);
        log(this.b);
  
    }
    
    public int soma(int a, int b){
        return(a+b);
    }
    public double soma(double a, double b){
        return (a+b);
    }
    
    public double subtracao(double a, double b){
        return(a-b);
    }
    public int subtracao(int a, int b){
        return(a-b);
    }
    
    public double multiplicacao(double a, double b){
        return(a*b);
    }
    
    public double divisao(double a, double b){
        return(a/b);
    }
    
    public double exponenciacao(double a, double b){
       return(pow(a,b));
    }
    
    public double raizquadrada(double x){
        return sqrt(x);
    }
    
    
    public double geraRandomico(double a, double b){
        return(Math.random());
    }
    
     public double log(double x){
         return (log10(x));
    }
    

     public void imprimir(){
         System.out.println("A: " + this.a);
         System.out.println("B: " + this.b);
      
         
     }
}
    
    


