package lista2.execondicional;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int inic = sc.nextInt();
		int fin = sc.nextInt();
		if (fin > inic) {
			int horas = fin - inic;
			System.out.println("O jogo durou " + horas + " hora(s)");
		}
		else {
			int horas = (24 - inic) + fin;
			System.out.println("O jogo durou " + horas + " hora(s)");
		}
		sc.close();
	}

}
