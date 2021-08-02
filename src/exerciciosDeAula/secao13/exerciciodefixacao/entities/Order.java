package exerciciosDeAula.secao13.exerciciodefixacao.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import exerciciosDeAula.secao13.exerciciodefixacao.entities.enums.OrderStatus;

public class Order {

    public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private Date moment;
    private OrderStatus status;

    private List<OrderItem> itens = new ArrayList<>();

    public Order(){

    }

    public Order(Date moment, OrderStatus status) {
        this.moment = moment;
        this.status = status;
    }

    public Date getMoment() {
        return this.moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return this.status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public List<OrderItem> getItens() {
        return this.itens;
    }
    public void addItem(OrderItem item){
        itens.add(item);
    }
    public void removeItem(OrderItem item){
        itens.remove(item);
    }
    public Double total() {
        Double sum = 0.0;
        for (OrderItem c : itens){
            sum += c.subTotal();
        }
        return sum
    }
}
