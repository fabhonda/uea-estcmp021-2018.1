
package modelo;


public class Cliente {
    //Atributos
    private String cpf;
    private String endereco;
    private String nome;
    private String telefone;
    private String dataNascimento;
    private ContaPoupanca poupanca;
    private ContaCorrente corrente;
    
    //Construtores
    public Cliente(String pCpf, String pEndereco, String pNome, String pTelefone, String pDataNascimento){
        this.setCpf(pCpf);
        this.setDataNascimento(pDataNascimento);
        this.setEndereco(pEndereco);
        this.setNome(pNome);
        this.setTelefone(pTelefone);
    }
    
    public Cliente(String pCpf, String pEndereco, String pNome, String pTelefone, String pDataNascimento, ContaPoupanca pPoupanca){
        this.setCpf(pCpf);
        this.setDataNascimento(pDataNascimento);
        this.setEndereco(pEndereco);
        this.setNome(pNome);
        this.setTelefone(pTelefone);
        this.setPoupanca(pPoupanca);
    }
    
    public Cliente(String pCpf, String pEndereco, String pNome, String pTelefone, String pDataNascimento, ContaCorrente pCorrente){
        this.setCpf(pCpf);
        this.setDataNascimento(pDataNascimento);
        this.setEndereco(pEndereco);
        this.setNome(pNome);
        this.setTelefone(pTelefone);
        this.setCorrente(pCorrente);
    }
    
    public Cliente(String pCpf, String pEndereco, String pNome, String pTelefone, String pDataNascimento, ContaCorrente pCorrente, ContaPoupanca pPoupanca){
        this.setCpf(pCpf);
        this.setDataNascimento(pDataNascimento);
        this.setEndereco(pEndereco);
        this.setNome(pNome);
        this.setTelefone(pTelefone);
        this.setPoupanca(pPoupanca);
        this.setCorrente(pCorrente);
    }

    //Métodos
    public void abrirContaCorrente(ContaCorrente pCorrente){
        this.setCorrente(pCorrente);
        System.out.println("Conta Corrente aberta!");
    }
    
    public void fecharContaCorrente(){
        this.setCorrente(null);
        System.out.println("Conta Corrente fechada!");
    }
    
    public void abrirContaPoupanca(ContaPoupanca pPoupanca){
        this.setPoupanca(pPoupanca);
        System.out.println("Conta Poupança aberta!");
    }
    
    public void fecharContaPoupanca(){
        this.setPoupanca(null);
        System.out.println("Conta Poupança fechada!");
    }
    
    public void mostrarDadosCliente(){
        System.out.println("-----------[CLIENTE]-----------");
        System.out.println("Cpf: " + this.getCpf());
        System.out.println("Endereço: " + this.getEndereco());
        System.out.println("Nome: " + this.getNome());
        System.out.println("Telefone: " + this.getTelefone());
        System.out.println("Data de Nascimento: " + this.getDataNascimento());
        System.out.println();
    }
    
    //Get's e Set's
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public ContaPoupanca getPoupanca() {
        return poupanca;
    }

    public void setPoupanca(ContaPoupanca poupanca) {
        this.poupanca = poupanca;
    }

    public ContaCorrente getCorrente() {
        return corrente;
    }

    public void setCorrente(ContaCorrente corrente) {
        this.corrente = corrente;
    }

}
