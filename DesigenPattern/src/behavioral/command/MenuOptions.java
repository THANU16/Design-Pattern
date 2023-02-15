package behavioral.command;

//Invoker
public class MenuOptions {
    private Command open;
    private Command save;

    public MenuOptions(Command open, Command save) {
        this.open = open;
        this.save = save;
    }

    public void clickOpen(){
        open.execute();
    }

    public void clickSave(){
        save.execute();
    }
}
