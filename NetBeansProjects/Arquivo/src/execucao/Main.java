
package execucao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import modelo.Aluno;

public class Main {

    public static void main(String[] args) {
        /*
        Aluno al1 = new Aluno("João",20,5.8);
        Aluno al2 = new Aluno("Maria",31,9.9);
        Aluno al3 = new Aluno("José",19,8.8);
        
        try{
            FileOutputStream fout = new FileOutputStream("aluno.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fout);
            
            oos.writeObject(al1);
            
            oos.close();
            fout.close();
            
        }catch(Exception e){
            
        }
        */
        
        Aluno al1 = new Aluno();
        
        try{
            FileInputStream fin = new FileInputStream("aluno.ser");
            ObjectInputStream ois = new ObjectInputStream(fin);
            
            al1 = (Aluno)ois.readObject();
            ois.close();
            al1.mostrarDados();
            fin.close();
            
        }catch(Exception e){
            
        }
        
    }
    
}
