package creational.factoryMethod;

public class FactoryMethodDemo {
    public static void main(String[] args) {
        SoapFactory soapFactory = new LuxCreator();
        soapFactory.createSoap();
        SoapFactory soapFactory1 = new SunlightCreator();
        soapFactory1.createSoap();
    }
}
