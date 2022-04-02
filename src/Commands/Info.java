package Commands;

import App.*;

public class Info implements Command {

    private final CollectionManager collectionManager;

    public Info(CollectionManager collectionManager) {
        this.collectionManager = collectionManager;
    }

    public void execute(String args[]) {
        collectionManager.info();
    }

    @Override
    public String toString() {
        return " Commands.Info - выводит информацию о коллекции (тип, дата инициализации и тд)";
    }
}
