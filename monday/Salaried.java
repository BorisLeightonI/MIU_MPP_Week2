package Week2.monday;

public class Salaried extends Employee {
    private double salary;

    @Override
    public double calcGrossPay(DateRange dateRange) {
        return 0;
    }

    public Salaried(double salary){
        this.salary = salary;
    }
    
}
