
package modelo;


public class TrabalhaEm {
    private String data;
    private Empregado emp;
    private Projetos proj;

    public TrabalhaEm(){
        this.data = "";
        this.emp = null;
        this.proj = null;
    }
    
    public TrabalhaEm(Empregado pEmp, Projetos pProj, String pData){
        this.setData(pData);
        this.setEmp(pEmp);
        this.setProj(pProj);
    }

   public void mostraDados(){
       System.out.println("******Dados Trabalha Em******");
       this.getEmp().mostraDados();
       this.getProj().mostraDados();
       System.out.println("Data: " + this.getData());
       System.out.println("*******************");
   }
    

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }


    public Empregado getEmp() {
        return emp;
    }


    public void setEmp(Empregado emp) {
        this.emp = emp;
    }


    public Projetos getProj() {
        return proj;
    }


    public void setProj(Projetos proj) {
        this.proj = proj;
    }
}
