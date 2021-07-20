package exerciciosDeAula.secao8.exercicio3.application;

import java.util.Locale;
import java.util.Scanner;

import exerciciosDeAula.secao8.exercicio3.entities.Student;

public class Program {
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        student.setName(sc.nextLine());
        student.setGrade1(sc.nextDouble());
        student.setGrade2(sc.nextDouble());
        student.setGrade3(sc.nextDouble());

        System.out.printf("FINAL GRADE = %.2f%n", student.finalGrade());
        
        if (student.finalGrade() >= 60){
            System.out.println("PASS");
        }
        else {
            System.out.println("FAILED");
            System.out.printf("MISSING  %.2f POINTS", student.missingPoints());
        }

        sc.close();
    }
}
