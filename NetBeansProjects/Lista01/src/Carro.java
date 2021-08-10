
public class Carro {
    String numChassi;
    double quilometragem;
    double velocidade;
    double potencia;
    double cor;
    double qtdePortas;

    
    void ligar(){
        System.out.println(numChassi + "está ligando");
    }
    
    void desligar(){
        System.out.println(numChassi + "está desligando");
    }
    
    void acelerar(){
        System.out.println(numChassi + "está acelerando");
    }
    
    void frear(){
        System.out.println(numChassi + "está freando");
    }
    
    void girarVolante(){
          
    }
    
    void reduzirMarcha(){      
        System.out.println("Reduzindo marcha");
    }
}
