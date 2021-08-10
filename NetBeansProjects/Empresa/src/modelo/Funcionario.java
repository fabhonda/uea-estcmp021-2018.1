
package modelo;


public class Funcionario {
    //Atributos
    private String nome;
    private String funcao;
    Dependente dep;
    
    //Construtores
    public Funcionario(String pNome, String pFuncao, String pDepNome, String pDepPar){
        this.setFuncao(pFuncao);
        this.setNome(pNome);
        this.dep = new Dependente(pDepNome,pDepPar);
    }
    
    public Funcionario(String pNome, String pFuncao){
        this.setFuncao(pFuncao);
        this.setNome(pNome);
        this.dep = null;
    }
    
    //Métodos
    public void excluirDep(){
        this.dep = null;
    }
    
    public void mostrarDados(){
        System.out.println("Nome: "+this.nome);
        System.out.println("Função: "+this.funcao);
        
        if(this.dep != null){
            dep.mostrarDados();
        }
        System.out.println();
    }
    
    //Get's e Set's
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
}
