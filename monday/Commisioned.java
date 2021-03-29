package Week2.monday;

import java.util.ArrayList;
import java.util.List;

public class Commisioned extends Employee {

    private double baseSalary;
    private List<Order> orders;

    public Commisioned(double baseSalary){
        this.baseSalary = baseSalary;
        orders = new ArrayList<Order>();
    }

    @Override
    public double calcGrossPay(DateRange dateRange) {
        return baseSalary; // + a percentage (commission) on the total value of all orders they sold during that month. 

    }

    public void addOrder(Order order){
        orders.add(order);
    }
    
}
