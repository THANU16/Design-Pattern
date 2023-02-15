package behavioral.observer;

public class Subject1 extends Subject{
    private String state;
    public Subject1(String state){
        this.state= state;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
        super.notifyObservers(state);
    }
}
