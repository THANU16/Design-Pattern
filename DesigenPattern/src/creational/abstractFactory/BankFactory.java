package creational.abstractFactory;

public class BankFactory extends AbstactFactory {
    private Bank bank;


    @Override
    public Bank getBank(String bName) {
        switch (bName){
            case "BOC":
                this.bank = new BOC();
                break;
            case  "HNB" :
                this.bank = new HNB();
                break;
            default:
                System.out.println("Oops!!!..... Please enter your correct bank name");
                break;
        }
        return bank;
    }

    @Override
    public Loan getLoan(String loanName, double rate) {
        return null;
    }
}
