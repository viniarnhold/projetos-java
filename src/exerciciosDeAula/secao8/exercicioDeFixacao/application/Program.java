package exerciciosDeAula.secao8.exercicioDeFixacao.application;

import java.util.Locale;
import java.util.Scanner;

import exerciciosDeAula.secao8.exercicioDeFixacao.util.CurrencyConverter;
public class Program {
    public static void main(String[] args) {
     
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dolar price? ");
        double dollarPrice = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double mount = sc.nextDouble();
        double result = CurrencyConverter.dollarTotal(mount, dollarPrice);
        System.out.printf("Amount to be paid in reais = %.2f", result);

        sc.close();
    }    
}
