
package execucao;

import modelo.Engenheiro;
import modelo.Pessoa;
import modelo.Professor;

public class Main {


    public static void main(String[] args) {
        Engenheiro eng1 = new Engenheiro("João","111.111.111-11","123");
        
        eng1.respirar();
        eng1.projetar();
        System.out.println(eng1.obterDadosPessoa());
        
        if(eng1 instanceof Engenheiro){
            System.out.println(eng1.getNome() + " é um engenheiro");
        }
        if(eng1 instanceof Pessoa){
            System.out.println(eng1.getNome() + " é uma pessoa");
        }
        
        //Pessoa pes1 = new Pessoa("Fabrizio","333.333.333-33");
        //Pessoa pes1 = new Pessoa("Fabrizio","333.333.333-33");
        
        //Professor prof1 = new Professor("Márcia","444.444.444-44","Mestre");
        
        //prof1.corrigirProva();
        
    }
    
}
