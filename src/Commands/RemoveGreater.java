package Commands;

import App.CollectionManager;

public class RemoveGreater implements Command{
    private final CollectionManager collectionManager;

    public RemoveGreater(CollectionManager collectionManager) {
        this.collectionManager = collectionManager;
    }

    @Override
    public void execute(String args[]) {
        ElementInput elementInput = new ElementInput();
        collectionManager.removeGreater(elementInput.resultElement(collectionManager.getId()));
    }

    @Override
    public String toString() {
        return "remove_greater - удаляет все элементы, превышающий заданный";
    }

}
