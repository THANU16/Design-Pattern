package creational.abstractFactory;

public class FactoryCreator {
    private static AbstactFactory factory;
    public static AbstactFactory getFactory(String factoryName){
        switch (factoryName){
            case "BankFactory":
                factory = new BankFactory() ;
                break;
            case "LoanFactory":
                factory = new LoanFactory();
                break;
            default:
                System.out.println("Oops!!!...... Please enter the correct factory name");
                break;
        }
        return factory;
    }
}
