package lista2.exefor;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        for (int i = 1; i <= N; i++) {
            int quadrado = i * i;
            int cubo = i * i * i;

            System.out.println(i + " " + quadrado + " " + cubo);

        }
        sc.close();
    }
}
