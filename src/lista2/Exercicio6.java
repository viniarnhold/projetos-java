package lista2;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double A, B, C, triang, circ, trap, quadrad, ret;

		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();

		triang = A * C / 2;
		circ = 3.14159 * C * C;
		trap = (A + B) * C / 2;
		quadrad = B * B;
		ret = A * B;

		System.out.printf("Triangulo: %.3f%n", triang);
		System.out.printf("Circulo: %.3f%n", circ);
		System.out.printf("Trap�zio: %.3f%n", trap);
		System.out.printf("Quadrado: %.3f%n", quadrad);
		System.out.printf("Ret�ngulo: %.3f%n", ret);

		sc.close();
	}

}
