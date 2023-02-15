package behavioral.observer;

public class Observer1 implements Observer{
//    private String state;
//    public Observer1(String state){
//        this.state=state;
//    }

    @Override
    public void update(String state) {
        System.out.println("I am observer 1. I got your new state. Your new state is a "+state);
    }
}
