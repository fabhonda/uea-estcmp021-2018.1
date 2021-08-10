
package modelo;


public class Departamento {
    private String nomeDep;
    private String localDep;
    private int qtdeProfDep;
    private String dataCriacaoDep;
    
    
    public Departamento(){
  
    }
    
    public Departamento(String pNome, String pLocal, int pQtde, String pData){
        this.setNomeDep(pNome);
        this.setLocalDep(pLocal);
        this.setQtdeProfDep(pQtde);
        this.setDataCriacaoDep(pData);
    }
    
    public String getNomeDep(){
        return nomeDep;
    }
    
    public void setNomeDep(String nomeDep){
        this.nomeDep = nomeDep;
    }
    
     public String getLocalDep(){
        return localDep;
    }
    
    public void setLocalDep(String localDep){
        this.localDep = localDep;
    }
    
    
     public int getQtdeProfDep(){
        return qtdeProfDep;
    }
    
    public void setQtdeProfDep(int qtdeProfDep){
        this.qtdeProfDep = qtdeProfDep;
    }
    
     public String getDataCriacaoDep(){
        return dataCriacaoDep;
    }
    
    public void setDataCriacaoDep(String dataCriacaoDep){
        this.dataCriacaoDep = dataCriacaoDep;
    }
}
