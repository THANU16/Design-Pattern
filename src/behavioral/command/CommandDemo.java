package behavioral.command;

public class CommandDemo {
    public static void main(String[] args) {
        Document doc = new Document();
        Command openFile = new ActonOpen(doc);
        Command saveFile = new ActionSave(doc);

        MenuOptions menu = new MenuOptions(openFile,saveFile);
        menu.clickOpen();
        menu.clickSave();
    }
}
