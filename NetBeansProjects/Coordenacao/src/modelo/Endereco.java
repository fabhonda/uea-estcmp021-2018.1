
package modelo;


public class Endereco {
    private String rua;
    private int num;
    private String bairro;
    private String cep;
    private String cidade = "Manaus";
    private String estado = "AM";
    
    public Endereco(){
        this.rua = "";
        this.num = 0;
        this.bairro = "";
        this.cep = "";
    }
    
    public Endereco(String pRua, int pNum, String pBairro, String pCep){
        this.rua = pRua;
        this.num = pNum;
        this.bairro = pBairro;
        this.cep = pCep;
    }
    
    public Endereco(String pRua, int pNum, String pBairro, String pCep, String pCidade, String pEstado){
        this.rua = pRua;
        this.num = pNum;
        this.bairro = pBairro;
        this.cep = pCep;
        this.cidade = pCidade;
        this.estado = pEstado;
    }
    
    public void mostrarEndereco(){
        System.out.println("Rua: " + this.getRua());
        System.out.println("Número: " + this.getNum());
        System.out.println("CEP: " + this.getCep());
        System.out.println("Bairro: " + this.getBairro());
        System.out.println("Cidade: " + this.getCidade());
        System.out.println("Estado: " + this.getEstado());
    }
    
    public String getRua(){
        return this.rua;
    }
    
    public void setRua(String rua){
        this.rua = rua;
    }
    
    public int getNum(){
        return this.num;
    }
    
    public void setNum(int num){
        this.num = num;
    }
    
    public String getBairro(){
        return this.bairro;
    }
    
    public void setBairro(String bairro){
        this.bairro = bairro;
    }
    
    public String getCep(){
        return this.cep;
    }
    
    public void setCep(String cep){
        this.cep = cep;
    }
    
    public String getCidade(){
        return this.cidade;
    }
    
    public void setCidade(String cidade){
        this.cidade = cidade;
    }
    
    public String getEstado(){
        return this.estado;
    }
    
    public void setEstado(String estado){
        this.estado = estado;
    }
}
