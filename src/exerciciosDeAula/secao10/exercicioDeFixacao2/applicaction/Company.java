package exerciciosDeAula.secao10.exercicioDeFixacao2.applicaction;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import exerciciosDeAula.secao10.exercicioDeFixacao2.employee.Employee;

public class Company {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();
        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Employee #" + i + ":");
            System.out.print("Id: ");
            int id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            Employee employee = new Employee(id, name, salary);
            list.add(employee);
            System.out.println();
        }
        System.out.print("Enter the employee id that will have salary increase: ");
        int x = sc.nextInt();
        boolean achou = false;
        for (Employee employee : list) {
            if (employee.getId() == x) {
                achou = true;
                if (achou == true) {
                    System.out.print("Enter the percentage: ");
                    double add = sc.nextDouble();
                    employee.increaseSalary(add);
                }
            }
        }
        if (achou == false) {
            System.out.println("This id does not exist!");
        }
        System.out.println();
        System.out.println("List of employees: ");
        for (Employee employee : list) {
            System.out.println(employee);
        }
        sc.close();
    }
}
