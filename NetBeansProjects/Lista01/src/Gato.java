
public class Gato {
    String nome;
    String raca;
    float altura;
    float peso;
    String cor;
    String tipoComida;
    
    void miar(){
        System.out.println(nome + " está miando!");
    }
    
    void pular (){
        System.out.println(nome + " está pulando!");
        peso-=2;
    }
    
    void andar(){
        System.out.println(nome + " está andando!");
        peso--;
    }
    
    void comer (){
        System.out.println(nome + " está comendo!");
        peso++;
    }
    
    void dormir (){
        System.out.println(nome + " está dormindo!");
    }
    
}
