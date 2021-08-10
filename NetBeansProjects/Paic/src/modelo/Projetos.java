
package modelo;


public class Projetos {
    private String nome;
    private String sigla;
    private String descricao;
    private String local;

    public Projetos(){
        this.nome = "";
        this.sigla = "";
        this.descricao = "";
        this.local = "";
    }
    
    public Projetos(String pNome, String pSigla, String pDescricao, String pLocal){
        this.nome = pNome;
        this.sigla = pSigla;
        this.descricao = pDescricao;
        this.local = pLocal;
    }
    
    
    public void mostraDados(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Sigla: " + this.getSigla());
        System.out.println("Descrição: " + this.getDescricao());
        System.out.println("Local: " + this.getLocal());
    }
    

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
}
