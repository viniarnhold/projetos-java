package exerciciosDeAula.secao10.exercicioDeFixacao2.employee;

public class Employee {
    private Integer id;
    private String name;
    private Double salary;

    public Employee(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(double salary){
        this.salary = salary;
    }
    public void increaseSalary(double add){
        this.salary *= 1 + (add/100);
    } 
    public String toString(){
        return id
            + ", "
            + name
            + ", $ "
            + String.format("%.2f", salary);
    }
}
