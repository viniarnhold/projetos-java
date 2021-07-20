package exerciciosDeAula.secao8.exercicio3.entities;

public class Student {

    private String name;
    private double grade1, grade2, grade3;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setGrade1(double grade1) {
        this.grade1 = grade1;
    }

    public double getGrade1() {
        return this.grade1;
    }

    public void setGrade2(double grade2) {
        this.grade2 = grade2;
    }

    public double getGrade2() {
        return this.grade2;
    }

    public void setGrade3(double grade3) {
        this.grade3 = grade3;
    }

    public double getGrade3() {
        return this.grade3;
    }

    public double finalGrade() {
        return getGrade1() + getGrade2() + getGrade3();
    }
    public double missingPoints() {
        return 60 - finalGrade();
    }

}
