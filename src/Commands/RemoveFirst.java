package Commands;

import App.*;

public class RemoveFirst implements Command {
    private final CollectionManager collectionManager;

    public RemoveFirst(CollectionManager collectionManager) {
        this.collectionManager = collectionManager;
    }

    public void execute(String args[]) {
        collectionManager.remove_first();
    }

    @Override
    public String toString() {
        return "remove_first - удаляет первый элемент в коллекции";
    }
}
