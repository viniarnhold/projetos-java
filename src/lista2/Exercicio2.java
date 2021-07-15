package lista2;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double R , A;

		R = sc.nextDouble();
		A = 3.14159 * R * R;

		System.out.printf("A = %.4f", A);

		sc.close();


	}

}
