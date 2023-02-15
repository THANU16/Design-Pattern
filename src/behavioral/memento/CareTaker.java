package behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
   private List<Memento> states = new ArrayList<Memento>();
    private List<Memento> undoStates = new ArrayList<Memento>();


    public void add(Memento state){
        states.add(state);
        undoStates.add(state);
        System.out.println(states.size());
    }

    public Memento undo(){
        int lastIndex = (states.size()-1);

        if(lastIndex >= 0){
            Memento lastState = states.get(lastIndex);
            states.remove(lastState);
            return (Memento) lastState;
        }
        else {
            System.out.println("no previous State");
        }
        return null;
    }



}
