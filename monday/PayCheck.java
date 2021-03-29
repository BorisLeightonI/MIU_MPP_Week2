package Week2.monday;



public class PayCheck {
    private double grossPay;
    private double fica = 0.23;
    private double state = 0.05;
    private double local = 0.01;
    private double socialSecurity = 0.075;
    private DateRange payPeriod;

    public PayCheck(double grossPay, DateRange payPeriod){
        this.grossPay = grossPay;  
        this.payPeriod = payPeriod;          
    }

    public double getNetPay(){
        return grossPay*(1-fica-state-local-socialSecurity);
    }
    public void print(){
        System.out.println("PayCheck Info");
    }

}
