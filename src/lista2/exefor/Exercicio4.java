package lista2.exefor;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio4 {

    public static void main (String[] args){

            Locale.setDefault(Locale.US);

            Scanner sc = new Scanner(System.in);

            int N = sc.nextInt();

            for (int i=0; i<N; i++){
                Double a = sc.nextDouble();
                Double b = sc.nextDouble();
                double media = a/b;

                if (b==0){
                    System.out.println("Divisão Impossível");
                }
                else {
                    System.out.printf("%.1f", media);
                    System.out.println("");
                }
            }
            sc.close();
    }

}


