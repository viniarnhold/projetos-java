import java.util.Locale;
import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int func, horas;
		double salario, salariomes;
		
		func = sc.nextInt();
		horas = sc.nextInt();
		salario = sc.nextDouble();
		
		salariomes = salario * horas;
		
		System.out.println("Number: " + func);
		System.out.printf("Salary: U$ %.2f%n ", salariomes);
		
		sc.close();
	}

}
