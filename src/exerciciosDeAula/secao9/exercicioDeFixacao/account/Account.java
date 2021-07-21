package exerciciosDeAula.secao9.exercicioDeFixacao.account;

public class Account {

    private int number;
    private String name;
    private double value;

    public Account(int number, String name){
        this.number = number;
        this.name = name;
    }
    public Account(int number, String name, double value){
        this.number = number;
        this.name = name;
        this.value = value;
    }
    public int getNumber(){
        return number;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getValue(){
        return value;
    }
    public double addValue(double value){
        return this.value += value;
    }
    public double removeValue(double value){
        return this.value -= value + 5;
    }
    public String toString(){
        return "Account "
        + getNumber() 
        + ", Holder: "
        + getName()
        + " Balance: $ "
        + String.format("%.2f%n", getValue());
    }
    
}
