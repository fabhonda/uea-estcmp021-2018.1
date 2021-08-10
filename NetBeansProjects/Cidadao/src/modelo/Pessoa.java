
package modelo;

import java.util.ArrayList;


public class Pessoa implements Cidadao, Contribuinte {
    //Atributos
    private String nome;
    private double salario;
    private Carro carro;
    private ArrayList<Fone> fone;
    
    //Construtores
    public Pessoa(String pNome, double pSalario, Carro pCarro){
        this.setNome(pNome);
        this.setSalario(pSalario);
        this.setCarro(pCarro);
        this.fone = new ArrayList<Fone>();
    }
    
    //Métodos
    public void mostrarPessoa(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Salário: " + this.getSalario());
        System.out.println("Carro: " + this.getCarro());
    }
    
    public void incluirFone(Fone obj){
        this.fone.add(obj);
    }
    
    public void removerFone(Fone obj){
        this.fone.remove(obj);
    }
    
    public void mostrarDados(){
        this.mostrarPessoa();
        for(int i=0; i<this.fone.size();i++){
            System.out.println("Fone " + i+1 + ": " + this.fone.get(i));
        }
    }
    
    //Get's e Set's
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    //Sobrescrita das Interfaces
    @Override
    public double calcularValorIR() {
        return 1;
    }

    @Override
    public double calcularIPVA() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void votar() {
        System.out.println(this.getNome() + " pode votar");
    }

    @Override
    public String emitirRG() {
        return "1234";
    }
}
