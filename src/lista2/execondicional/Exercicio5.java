package lista2.execondicional;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int codigo = sc.nextInt();

		if (codigo == 1) {
			int quant = sc.nextInt();
			double valor = quant * 4.00;
			System.out.printf("Total: R$ %.2f", valor);
		}
		else if (codigo == 2) {
			int quant = sc.nextInt();
			double valor = quant * 4.50;
			System.out.printf("Total: R$ %.2f", valor);
		}
		else if (codigo == 3) {
			int quant = sc.nextInt();
			double valor = quant * 5.00;
			System.out.printf("Total: R$ %.2f", valor);
		}
		else if (codigo == 4) {
			int quant = sc.nextInt();
			double valor = quant * 2.00;
			System.out.printf("Total: R$ %.2f", valor);
		}
		else if (codigo == 5) {
			int quant = sc.nextInt();
			double valor = quant * 1.50;
			System.out.printf("Total: R$ %.2f", valor);
		}
		sc.close();
	}

}
