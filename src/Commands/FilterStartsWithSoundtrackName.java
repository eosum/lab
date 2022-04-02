package Commands;

import App.*;

public class FilterStartsWithSoundtrackName implements Command{
    private final CollectionManager collectionManager;

    public FilterStartsWithSoundtrackName(CollectionManager collectionManager) {
        this.collectionManager = collectionManager;
    }

    public void execute(String args[]) {
        if(args.length == 0) {
            System.out.println("Подстрока не может быть пустой!");
        } else {
            String SubString = String.join(" ", args);
            collectionManager.filter_starts_with_soundtrack_name(SubString);
        }
    }

}
