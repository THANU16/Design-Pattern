package creational.factoryMethod;

public class SunlightCreator extends SoapFactory{
    @Override
    public Soap createSoap() {
        return new Sunlight();
    }
}
