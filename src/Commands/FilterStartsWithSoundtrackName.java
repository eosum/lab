package Commands;

import App.*;

public class FilterStartsWithSoundtrackName implements Command{
    private final CollectionManager collectionManager;

    public FilterStartsWithSoundtrackName(CollectionManager collectionManager) {
        this.collectionManager = collectionManager;
    }

    @Override
    public void execute(String args[]) {
        String SubString = String.join(" ", args);
        collectionManager.filterStartsWithSoundtrackName(SubString);
    }

}
