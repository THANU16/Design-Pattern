package creational.abstractFactory;

public class LoanFactory extends AbstactFactory {
    private Loan loan;

    @Override
    public Bank getBank(String bName) {
        return null;
    }

    @Override
    public Loan getLoan(String loanName, double rate) {
        switch (loanName){
            case "HouseLoan":
                this.loan = new HouseLoan(rate);
                break;
            case  "HNB" :
                this.loan = new EducationLoan(rate);
                break;
            default:
                System.out.println("Oops!!!..... Please enter your correct loan name");
                break;
        }
        return loan;
    }
}
