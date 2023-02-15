package behavioral.observer;

import java.util.ArrayList;

public abstract class Subject {
    private ArrayList<Observer> observers = new ArrayList<Observer>();
    public void addObservers(Observer observer){
        observers.add(observer);
        System.out.println("Done.  Your current observer add in our observers list");
    }

    public void removeObservers(Observer observer){
        if (observers.contains(observer)) {
            observers.remove(observer);
            System.out.println("Done.  Your current observer remove in our observers list");
        }
        else{
            System.out.println("OOPS!!!........... You current observer is not contain our observers list");
        }
    }
    public void notifyObservers(String newState){
        for(Observer observer:observers){
            observer.update(newState);
        }
    }
}
