package exerciciosDeAula.secao9.exercicioDeFixacao.application;

import java.util.Locale;
import java.util.Scanner;

import exerciciosDeAula.secao9.exercicioDeFixacao.account.Account;

public class Bank {
    
    public static void main(String[] args){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account name: ");
        String name = sc.nextLine();
        Account account = new Account(number, name);
        System.out.print("Is there an initial deposit (y/n)? ");
        char quest = sc.next().charAt(0);
            if (quest == 'y'){
                System.out.print("Enter initial deposit value: ");
                double value = sc.nextDouble();
                account = new Account(number, name, value);      
            }
        System.out.println();
        System.out.println("Account data:");
        System.out.println(account);
        
        System.out.print("Enter a deposit value:: ");
        double value = sc.nextDouble();
        account.addValue(value);
        System.out.println("Updated account data:");
        System.out.println(account);

        System.out.print("Enter a withraw value:: ");
        value = sc.nextDouble();
        account.removeValue(value);
        System.out.println("Updated account data:");
        System.out.println(account);

        sc.close();
    }
}
