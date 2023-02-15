package creational.abstractFactory;

public class AbstractFactoryMain {
        public static void main(String[] args) {
                AbstactFactory bankFactory =  FactoryCreator.getFactory("BankFactory");
                Bank bank = bankFactory.getBank("BOC");
                System.out.println(bank.bankName());

                AbstactFactory loanFactory =  FactoryCreator.getFactory("LoanFactory");
                Loan loan = loanFactory.getLoan("HouseLoan" , 12.256);
                System.out.println(loan.getRate());

        }
}
