package shp.updated;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        SuperHeroes heroi = new SuperHeroes();

        System.out.println("1-Cadastro");
        System.out.println("2-Listagem");
        System.out.println("3-Sair");

        int menu = sc.nextInt();

        if (menu == 1) {
            System.out.println("Código do Herói:");
            heroi.setCodigo(sc.nextInt());
            System.out.println("Nome do Herói:");
            heroi.setNome(sc.next());
            System.out.println("Coeficiente de Força:");
            heroi.setCoeficiente(sc.nextInt());

            System.out.println("Herói cadastrado com sucesso!");
            System.out.println(heroi);

        } else {

        }

        sc.close();

    }
}