package creational.abstractFactory;

public abstract class AbstactFactory {
    public abstract Bank getBank(String bName);

    public abstract Loan getLoan(String loanName, double rate);
}
