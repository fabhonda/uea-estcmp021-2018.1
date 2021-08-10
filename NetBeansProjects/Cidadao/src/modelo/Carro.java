
package modelo;


public class Carro {
    //Atributos
    private String marca;
    private double valor;
    private String placa;
    private int ano;

   //Construtores
    public Carro(String pMarca, double pValor, String pPlaca, int pAno){
        this.setMarca(pMarca);
        this.setValor(pValor);
        this.setPlaca(pPlaca);
        this.setAno(pAno);
    }
    
    //Get's e Set's
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
