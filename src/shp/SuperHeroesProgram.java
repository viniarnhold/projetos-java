package shp;

import java.util.Scanner;

public class SuperHeroesProgram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int menu, codheroi, coeffor;
        String nome;

        System.out.println("1-Cadastro");
        System.out.println("2-Listagem");
        System.out.println("3-Sair");

        menu = sc.nextInt();

        if (menu == 1) {
            System.out.println("Código do Herói:");
            codheroi = sc.nextInt();
            System.out.println("Nome do Herói:");
            nome = sc.next();
            System.out.println("Coeficiente de Força:");
            coeffor = sc.nextInt();

            System.out.println("Herói cadastrado com sucesso!");
            System.out.println("Heroi " + codheroi + " - " + nome + " com " + coeffor + " força");

        } else {

        }

        sc.close();

    }
}