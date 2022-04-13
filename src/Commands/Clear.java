package Commands;

import App.*;

public class Clear implements Command {

    private final CollectionManager collectionManager;

    public Clear(CollectionManager collectionManager) {
        this.collectionManager = collectionManager;
    }

    @Override
    public void execute(String args[], boolean fromFile) {
        collectionManager.clear();
    }

    @Override
    public String toString() {
        return "Commands.Clear - отчистить коллекцию";
    }
}
