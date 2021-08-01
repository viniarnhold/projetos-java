package exerciciosDeAula.secao13.exemplo1.application;

import java.util.Date;

import exerciciosDeAula.secao13.exemplo1.entities.Order;
import exerciciosDeAula.secao13.exemplo1.entities.enums.OrderStatus;

public class Program {
    public static void main(String[] args) {

        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.print(order);
    }
}
