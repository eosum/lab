package Commands;

import App.*;

public class RemoveById implements Command {

    private final CollectionManager collectionManager;

    public RemoveById(CollectionManager collectionManager) {
        this.collectionManager = collectionManager;
    }

    public void execute(String args[]) {
        try {
            final Long id = Long.parseLong(args[0]);
            if (!this.collectionManager.remove_by_id(id)) {
                System.out.println("Объекта с id = " + id + " не найдено");
            }
        }
        catch (NumberFormatException e) {
            System.out.println("Некорректный ввод! id не введен или введен неверно");
        }
    }

    @Override
    public String toString() {
        return "remove_by_id - удаляет элемент из коллекции по его id";
    }
}
