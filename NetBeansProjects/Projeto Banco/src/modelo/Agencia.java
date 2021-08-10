
package modelo;


public class Agencia {
    //Atributos
    private String codigo;
    
    //Construtores
    public Agencia(String pCodigo){
        this.setCodigo(pCodigo);
    }

    //Get's e Set's
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
}
