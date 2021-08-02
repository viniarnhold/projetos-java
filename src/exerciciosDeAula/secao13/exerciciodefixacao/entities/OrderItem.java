package exerciciosDeAula.secao13.exerciciodefixacao.entities;

public class OrderItem {
    private Integer quantity;
    private Double price;
    private String product;


    public OrderItem(Integer quantity, Double price, String productName) {
        this.quantity = quantity;
        this.price = price;
        this.product = productName;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getProduct() {
        return this.product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public Double subTotal(){
        return quantity * price;
    }

}
