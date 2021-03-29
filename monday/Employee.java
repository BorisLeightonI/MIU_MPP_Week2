package Week2.monday;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

/**
 * Employee
 */
public abstract class Employee {
    private int empId;
    private List<PayCheck> paychecks;
    public abstract double calcGrossPay(DateRange dateRange);

    public PayCheck calcCompensation(int month, int year){
        
        return new PayCheck(0, payPeriod)
    }
    
}