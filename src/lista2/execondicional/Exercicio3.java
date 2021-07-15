package lista2.execondicional;
import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int x, y;

		x = sc.nextInt();
		y = sc.nextInt();

		if (x % y == 0 || y % x == 0) {
			System.out.println("S�o m�ltiplos");
		}
		else {
			System.out.println("N�o s�o m�ltiplos");
		}
		sc.close();
	}

}
