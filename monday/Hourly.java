package Week2.monday;

public class Hourly extends Employee{

    private double hourlyWage ;
    private int hoursPerWeek;

    @Override
    public double calcGrossPay(DateRange dateRange) {
        return 4*hourlyWage*hoursPerWeek;
    }
    
}
