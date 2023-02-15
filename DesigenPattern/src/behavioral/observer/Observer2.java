package behavioral.observer;

public class Observer2 implements Observer{
    @Override
    public void update(String state) {
        System.out.println("I am observer 2. I got your new state. Your ne state is a "+state);
    }
}
