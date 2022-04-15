package App;

import Parser.ParserFromXml;

import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        CollectionManager collectionManager = new CollectionManager();
        CommandsList commandsList = new CommandsList(collectionManager);

        if (args.length > 0) {
            ParserFromXml parserFromXml = new ParserFromXml();
            parserFromXml.parser();
            collectionManager.mergeCollections(parserFromXml.getCollection());
        }

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Введите команду");
            String command = input.nextLine();
            commandsList.execute(command, false);
        }
    }
}
