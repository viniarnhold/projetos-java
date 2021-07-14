import java.util.Locale;
import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int pec1, pec2, quant1, quant2;
		double valor1, valor2, total;
		
		pec1 = sc.nextInt();
		quant1 = sc.nextInt();
		valor1 = sc.nextDouble();
		sc.nextLine();
		pec2 = sc.nextInt();
		quant2 = sc.nextInt();
		valor2 = sc.nextDouble();
		
		total = quant1 * valor1 + quant2 * valor2;
		
		System.out.printf("Valor à pagar: R$ %.2f", total);
		
		sc.close();

	}
}
