package exerciciosDeAula.secao8.exercicio2.application;

import java.util.Locale;
import java.util.Scanner;

import exerciciosDeAula.secao8.exercicio2.entities.Employee;

public class Program {

    public static void main (String[] args){
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();

        System.out.print("Name: ");
        employee.name = sc.nextLine();
        System.out.print("Gross salary: ");
        employee.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        employee.tax = sc.nextDouble();

        System.out.println(employee);

        System.out.printf("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);

        System.out.println("Update data: " + employee);

        sc.close();
    }
}
