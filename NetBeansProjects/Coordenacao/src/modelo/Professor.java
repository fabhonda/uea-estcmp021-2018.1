
package modelo;
import java.util.ArrayList;

public class Professor {
    private String nomeProf;
    private String cpfProf;
    private String matriculaProf;
    private String tituloProf;
    private String foneProf;
    Departamento depProf;
    ArrayList<Aluno> orientandos;
    Endereco endProf;
    
    
    public Professor(){
        this.nomeProf = "";
        this.cpfProf = "";
        this.matriculaProf = "";
        this.tituloProf = "";
        this.foneProf = "";
        this.depProf = null;
        this.orientandos = new ArrayList<Aluno>();
        this.endProf = new Endereco();
    }
    
    public Professor(String pNome, String pCpf, String pMat, String pTitulo, String pFone, Departamento pDep, String pRua, int pNum, String pCep, String pBairro){
        this.nomeProf = pNome;
        this.cpfProf = pCpf;
        this.matriculaProf = pMat;
        this.tituloProf = pTitulo;
        this.foneProf = pFone;
        this.depProf = pDep;
        this.orientandos = new ArrayList<Aluno>();
        this.endProf = new Endereco(pRua, pNum, pBairro, pCep);
    }
    
     public Professor(String pNome, String pCpf, String pMat, String pTitulo, String pFone, String pRua, int pNum, String pCep, String pBairro){
        this.nomeProf = pNome;
        this.cpfProf = pCpf;
        this.matriculaProf = pMat;
        this.tituloProf = pTitulo;
        this.foneProf = pFone;
        this.orientandos = new ArrayList<Aluno>();
        this.endProf = new Endereco(pRua, pNum, pBairro, pCep);
    }
    
     
      public Professor(String pNome, String pCpf, String pMat, String pTitulo, String pFone, String pRua, int pNum, String pCep, String pBairro, String pCidade, String pEstado){
        this.nomeProf = pNome;
        this.cpfProf = pCpf;
        this.matriculaProf = pMat;
        this.tituloProf = pTitulo;
        this.foneProf = pFone;
        this.orientandos = new ArrayList<Aluno>();
        this.endProf = new Endereco(pRua, pNum, pBairro, pCep, pCidade, pEstado);
    }
    
 
    public void mostrarDadosProf(){
        System.out.println("Nome: " + this.nomeProf);
        System.out.println("CPF: " + this.cpfProf);
        System.out.println("Matrícula: " + this.matriculaProf);
        System.out.println("Título: " + this.tituloProf);
        System.out.println("Fone: " + this.foneProf);
        this.endProf.mostrarEndereco();
        System.out.println();
        
    }
    
    public void addOrientando(Aluno obj){
        this.orientandos.add(obj);
    }
    
    public void removerOrientando(Aluno obj){
        this.orientandos.remove(obj);
    }
    
    public void mostrarOrientando(){
        for(int i=0; i<this.orientandos.size();i++){
            this.orientandos.get(i).mostrarDadosAlu();
        }
        System.out.println();
    }
    
    public void cadastraDepartamentoProf(Departamento pDep){
       this.depProf = pDep;
    }
    
    
    public String getNomeProf(){
        return this.nomeProf;
    }
    public void setNomeProf(String nomeProf){
        this.nomeProf = nomeProf;
    }
    
    public String getCpfProf(){
        return this.cpfProf;
    }
    public void setCpfProf(String cpfProf){
        this.cpfProf = cpfProf;
    }
    
    public String getMatriculaProf(){
        return this.matriculaProf;
    }
    public void setMatriculaProf(String matriculaProf){
        this.matriculaProf = matriculaProf;
    }
    
    public String getTituloProf(){
        return this.tituloProf;
    }
    public void setTituloProf(String tituloProf){
        this.tituloProf = tituloProf;
    }
    
    public String getFoneProf(){
        return this.foneProf;
    }
    public void setFoneProf(String foneProf){
        this.foneProf = foneProf;
    }
    
}
