package exerciciosDeAula.secao13.exerciciodefixacao.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import exerciciosDeAula.secao13.exemplo1.entities.enums.OrderStatus;

public class Order {

    public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date date;
    private OrderStatus status;
    private Client client;
    private List<OrderItem> itens = new ArrayList<>();

    public Order() {

    }
    public Order(Date date, OrderStatus status, Client client) {
        this.date = date;
        this.status = status;
        this.client = client;
    }

    public Date getDate() {
        return this.date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public OrderStatus getStatus() {
        return this.status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return this.client;
    }

    public void setClient(Client client) {
        this.client = client;
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
    public Double total(){
        Double sum = 0.0;
        for (OrderItem c : itens){
            sum += c.subTotal();
        }
        return sum;
    }


}