package creational.multitone;

import java.util.HashMap;

//managers have unique id so we use multitone
public class Manager {
    private String name;
    private int age;
    private Integer id;
    private static Manager manager = null;
    private static final HashMap<Integer, Manager> managers = new HashMap<Integer, Manager>();

    private Manager(String name, int age, Integer id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public static Manager getInstance(String name, int age, Integer id){
        if(managers.containsKey(id)){
            manager = managers.get(id);
        }
        else {
            manager = new Manager(name, age, id);
            managers.put(id,manager);
        }
        return manager;
    }

    public void getDetails(){
        System.out.println(name+", "+ age+", "+id);
    }

}
