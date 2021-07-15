package lista2.execondicional;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x;

		x = sc.nextInt();

		if (x >= 0) {
			System.out.println("N�o Negativo");
		}
		else {
			System.out.println("Negativo");
		}

		sc.close();
	}
}
