package Commands;

import App.CollectionManager;
import InputInfo.ElementInput;

public class Update implements Command {
    private final CollectionManager collectionManager;

    public Update(CollectionManager collectionManager) {
        this.collectionManager = collectionManager;
    }

    public void execute(String args[], boolean fromFile) {
        try {
            final Long id = Long.parseLong(args[0]);
            if (!this.collectionManager.updateById(id)) {
                System.out.println("Объекта с id = " + id + " не найдено");
            } else {
                ElementInput elementInput = new ElementInput();
                collectionManager.add(elementInput.resultElement(id));
            }
        }
        catch (NumberFormatException e) {
            System.out.println("Некорректный ввод! id не введен или введен неверно");
        }
    }

    @Override
    public String toString() {
        return "update - обновить значение элемента коллекции, id которого совпадает с исходным";
    }
}
