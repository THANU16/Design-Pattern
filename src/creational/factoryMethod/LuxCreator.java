package creational.factoryMethod;

public class LuxCreator extends SoapFactory {

    @Override
    public Soap createSoap() {
        return new Lux();
    }
}
