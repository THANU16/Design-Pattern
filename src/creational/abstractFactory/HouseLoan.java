package creational.abstractFactory;

public class HouseLoan implements Loan{
    private double rate;
    public HouseLoan(double rate){
        this.rate = rate;
    }
    @Override
    public double getRate() {
        return rate;
    }
}
