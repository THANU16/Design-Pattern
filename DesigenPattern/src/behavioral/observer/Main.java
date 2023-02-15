package behavioral.observer;

public class Main {
    public static void main(String[] args) {
        Subject1 subject = new Subject1("Hi, I am Thanushanth");
        Observer o1 =new Observer1();
        Observer o2 =new Observer2();
        subject.addObservers(o1);
        subject.setState("hello, I am Kaadu");
        System.out.println(subject.getState());
        System.out.println("");

        subject.addObservers(o2);
        subject.setState("hi, Your are maadu");
        System.out.println(subject.getState());
        System.out.println("");

        subject.removeObservers(o1);
        subject.setState("hi, Your are thanu");
        System.out.println(subject.getState());
        System.out.println("");

    }
}
