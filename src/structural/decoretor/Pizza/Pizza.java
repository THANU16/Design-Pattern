package structural.decoretor.Pizza;

//pizza definer
public abstract class Pizza {
    private String Description;
    public String getDescription (){
        return "Your pizza";
    }

    public abstract int cost();
}
