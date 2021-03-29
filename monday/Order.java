package Week2.monday;

import java.time.LocalDate;

public class Order {
    private int orderNum;
    private LocalDate orderDate;
    private double orderAmount;

    public Order(int orderNum, LocalDate orderDate, double orderAmount){
        this.orderNum = orderNum;
        this.orderDate = orderDate;
        this.orderAmount = orderAmount;
    }
}
