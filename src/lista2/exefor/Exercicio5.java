package lista2.exefor;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int x = 1;

        for (int i = 1; i <= N; i++) {
            x *= i;
        }
        System.out.println(x);

        sc.close();
    }
}
