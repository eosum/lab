package Commands;

import App.*;

public class Show implements Command {

    private final CollectionManager collectionManager;

    public Show(CollectionManager collectionManager) {
        this.collectionManager = collectionManager;
    }

    @Override
    public void execute(String args[]) {
        collectionManager.show();
    }

    @Override
    public String toString() {
        return "Commands.Show - выводит все элементы коллекции в строковом представлении";
    }
}
