package behavioral.memento;

public class Originator {
    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    public Memento saveStateInMemento(String state){
        Memento obj = new Memento(state);
//        careTaker.add(obj);
        return obj;
    }

    public void undoState(Memento memento){
        state = memento.getState();
    }
}
