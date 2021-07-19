package shp.updated;

public class SuperHeroes {

    private String nome;
    private int codigo, coeficiente;

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){ 
        return this.nome;
    }
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    public int getCodigo(){ 
        return this.codigo;
    }
    public void setCoeficiente(int coeficiente){
        this.coeficiente = coeficiente;
    }
    public int getCoeficiente(){ 
        return this.coeficiente;
    }
    public String toString(){
        return "Heroi " + codigo + " - " + nome + " com " + coeficiente + " força";

    }
}
