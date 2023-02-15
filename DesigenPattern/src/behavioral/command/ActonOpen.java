package behavioral.command;

public class ActonOpen implements Command{
    private Document doc;

    public ActonOpen(Document doc) {
        this.doc = doc;
    }

    @Override
    public void execute() {
        doc.open();
    }
}
