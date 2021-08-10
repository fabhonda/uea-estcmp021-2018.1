
public class Gato {
    String nome;
    int idade; 
    float peso; 
    
    void comer(){
        System.out.println(nome + " está comendo");
        peso+=2;
        System.out.println("O novo peso é: " + peso);
  
    }
    
    void correr(){
        System.out.println(nome + " está correndo");
        peso--;
        System.out.println("O novo peso é: " + peso);
    }
    
    void fazeraniversario(){
        System.out.println(nome + " está fazendo aniversário");
        idade++;
        System.out.println("A nova idade é: " + idade);
    }
    
    void mostrarDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso);
    }
}

   
        