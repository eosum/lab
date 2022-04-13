package Commands;


import App.CollectionManager;
import Parser.ParserToXml;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class Save implements Command {

    private final CollectionManager collectionManager;

    public Save(CollectionManager collectionManager) {
        this.collectionManager = collectionManager;
    }

    @Override
    public void execute(String[] args, boolean fromFile) {
        collectionManager.save();
    }


    @Override
    public String toString() {
        return "save - сохраняет коллекцию в файл";
    }
}
