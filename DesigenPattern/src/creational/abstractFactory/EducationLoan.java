package creational.abstractFactory;

public class EducationLoan implements Loan{
    private double rate;

    public EducationLoan(double rate) {
        this.rate = rate;
    }

    @Override
    public double getRate() {
        return rate;
    }
}
