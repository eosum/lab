package Commands;

import App.CollectionManager;

public class Add implements Command {
    private final CollectionManager collectionManager;

    public Add(CollectionManager collectionManager) {
        this.collectionManager = collectionManager;
    }

    @Override
    public void execute(String args[]) {
        ElementInput elementInput = new ElementInput();
        collectionManager.add(elementInput.resultElement(collectionManager.getId()));
    }

    @Override
    public String toString() {
        return "Commands.Add - добавляет новый элемент в коллекцию";
    }
}
