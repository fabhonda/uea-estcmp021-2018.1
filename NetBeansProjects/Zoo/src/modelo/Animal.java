
package modelo;


public class Animal {
    //Atributos
    private String nome;
    private double comp;
    private int patas=4;
    private String cor;
    private String ambiente;
    private double velocidade;
    
    //Construtores
    public Animal(){
        this.setNome("");
        this.setAmbiente("");
        this.setComp(0.0);
        this.setCor("");
        this.setVelocidade(0.0);
        this.setPatas(4);
    }
    
    public Animal(String pNome, double pComp, int pPatas, String pCor, String pAmbiente, double pVelocidade){
        this.setNome(pNome);
        this.setAmbiente(pAmbiente);
        this.setComp(pComp);
        this.setCor(pCor);
        this.setVelocidade(pVelocidade);
        this.setPatas(pPatas);
    }
    
    //Métodos
    public void mostrarDados(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Ambiente: " + this.getAmbiente());
        System.out.println("Comprimento: " + this.getComp());
        System.out.println("Cor: " + this.getCor());
        System.out.println("Velocidade: " + this.getVelocidade());
        System.out.println("Patas: " + this.getPatas());
    }
    
    //Get's e Set's
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getComp() {
        return comp;
    }

    public void setComp(double comp) {
        this.comp = comp;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getAmbiente() {
        return ambiente;
    }

    public void setAmbiente(String ambiente) {
        this.ambiente = ambiente;
    }

    public double getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }
}
