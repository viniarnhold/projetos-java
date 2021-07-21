package exerciciosDeAula.secao8.exercicioDeFixacao.util;

public class CurrencyConverter {

    public static double IOF = 0.06;

    public static double dollarTotal(double mount, double dollarPrice){
        return mount * dollarPrice * (1 + IOF);
    }

}
