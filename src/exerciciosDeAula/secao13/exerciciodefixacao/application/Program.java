package exerciciosDeAula.secao13.exerciciodefixacao.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import exerciciosDeAula.secao13.exemplo1.entities.Order;
import exerciciosDeAula.secao13.exerciciodefixacao.entities.Client;
import exerciciosDeAula.secao13.exerciciodefixacao.entities.OrderItem;
import exerciciosDeAula.secao13.exerciciodefixacao.entities.enums.OrderStatus;

public class Program {
    public static void main(String[] args) throws ParseException{
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter client data:");
        System.out.print("Name: ");
        String clientName = sc.nextLine();
        System.out.print("Email: ");
        String clientEmail = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date clientBirthDate = sdf.parse(sc.next());
        Client client = new Client(clientName, clientEmail, clientBirthDate);
        System.out.println("Enter order data:");
        System.out.print("Status:");
        String status = sc.nextLine();
        Date date = new Date();
        Order order = new Order(date, OrderStatus.valueOf(status), client);
        System.out.print("How many items to this order?");
        int n = sc.nextInt();

        for(int i = 1; i<=n;i++){
            System.out.println("Enter #" + i + " item data:");
            System.out.print("Product name: ");
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            Double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();
            OrderItem item = new OrderItem(quantity, productPrice, productName);
            order.addItem(item);
        }
        System.out.print("How many items to this order?");





        sc.close();
    }
}
