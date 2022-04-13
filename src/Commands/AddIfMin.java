package Commands;

import App.CollectionManager;
import InputInfo.ElementInput;

public class AddIfMin implements Command{
    private final CollectionManager collectionManager;

    public AddIfMin(CollectionManager collectionManager) {
        this.collectionManager = collectionManager;
    }

    @Override
    public void execute(String args[], boolean fromFile) {
        ElementInput elementInput = new ElementInput();
        collectionManager.addIfMin(elementInput.resultElement(collectionManager.getId()));
    }

    @Override
    public String toString() {
        return "add_if_min - добавляет элемент, если он меньше чем наименьший элемент коллекции";
    }

}
