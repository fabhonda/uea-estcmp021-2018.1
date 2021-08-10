
package main;
import modelo.Professor;
import modelo.Departamento;
import modelo.Aluno;

public class Main {


    public static void main(String[] args) {
       Professor prof1 = new Professor("Jose","111.111.111-11","9999-9999","Mestre", "1111","Rua J",5,"69000-000","Centro");
       Departamento dep1 = new Departamento ("Computacao","Est",20,"02/02/2008");
       
       Aluno alu1 = new Aluno("Aluno 1","222.222.222-22","222","Rua 1 casa 4");
       Aluno alu2 = new Aluno("Aluno 2","222.333.222-22","333","Rua 3 casa 4");
       Aluno alu3 = new Aluno("Aluno 3","222.444.222-22","444","Rua 4 casa 4");
       Aluno alu4 = new Aluno("Aluno 4","222.555.222-22","555","Rua 5 casa 4");
       
       prof1.addOrientando(alu1);
       prof1.addOrientando(alu4);
       
       
       prof1.cadastraDepartamentoProf(dep1);
       
       prof1.mostrarDadosProf();
       prof1.mostrarOrientando();
       
    }
    
}
