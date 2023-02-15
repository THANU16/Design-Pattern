package behavioral.memento;

public class Main {
    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        String state = "hi";
        originator.setState(state);
        careTaker.add(originator.saveStateInMemento(state));

        String state1 = "hello";
        originator.setState(state1);
        careTaker.add(originator.saveStateInMemento(state1));

        String state2 = "thanushanth";
        originator.setState(state2);
        careTaker.add(originator.saveStateInMemento(state2));

        String state3 = "Welcome";
        originator.setState(state3);
        careTaker.add(originator.saveStateInMemento(state3));


        System.out.println(originator.getState());



        originator.undoState( careTaker.undo());
        System.out.println(originator.getState());

        originator.undoState( careTaker.undo());
        System.out.println(originator.getState());

        originator.undoState( careTaker.undo());
        System.out.println(originator.getState());

        originator.undoState( careTaker.undo());
        System.out.println(originator.getState());

        originator.undoState( careTaker.undo());
        System.out.println(originator.getState());




    }
}
