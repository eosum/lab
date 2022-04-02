package Commands;

import App.*;

public class PrintAscending implements Command {
    private final CollectionManager collectionManager;

    public PrintAscending(CollectionManager collectionManager) {
        this.collectionManager = collectionManager;
    }

    public void execute(String args[]) {
        collectionManager.print_ascending();
    }

    @Override
    public String toString() {
        return "print_ascending - выводит элементы в порядке возрастания";
    }

}
