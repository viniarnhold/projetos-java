package lista2.execondicional;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x;

		x = sc.nextInt();

		if (x % 2 == 0) {
			System.out.println("Par");
		}
		else {
			System.out.println("�mpar");
		}
		sc.close();
	}

}
