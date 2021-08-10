
package modelo;

public class Aluno {
    private String nomeAlu;
    private String cpfAlu;
    private String matriculaAlu;
    private String enderecoAlu;
    
    public Aluno(){
        this.nomeAlu = "";
        this.cpfAlu = "";
        this.matriculaAlu = "";
        this.enderecoAlu = "";
    }
    
    public Aluno(String pNome, String pCpf, String pMat, String pEnd){
        this.nomeAlu = pNome;
        this.cpfAlu = pCpf;
        this.matriculaAlu = pMat;
        this.enderecoAlu = pEnd;      
    }
    
    public void mostrarDadosAlu(){
        System.out.println("Nome: " + this.nomeAlu);
        System.out.println("Cpf: " + this.cpfAlu);
        System.out.println("Matrícula: " + this.matriculaAlu);
        System.out.println("Endereço: " + this.enderecoAlu);
        System.out.println();
    }
    
    public String getNomeAlu(){
        return this.nomeAlu;
    }
    
    public void setNomeAlu(String nomeAlu){
        this.nomeAlu = nomeAlu;      
    }
    
    public String getCpfaAlu(){
        return this.cpfAlu;
    }
    
    public void setCpfaAlu(String cpfAlu){
        this.cpfAlu = cpfAlu;      
    }
    public String getMatriculaAlu(){
        return this.matriculaAlu;
    }
    
    public void setMatriculaAlu(String matriculaAlu){
        this.matriculaAlu = matriculaAlu;      
    }
    public String getEnderecoAlu(){
        return this.enderecoAlu;
    }
    
    public void setEnderecoAlu(String enderecoAlu){
        this.enderecoAlu = enderecoAlu;      
    }
    
}
