package Commands;


import App.CollectionManager;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Save implements Command {

    private final CollectionManager collectionManager;

    public Save(CollectionManager collectionManager) {
        this.collectionManager = collectionManager;
    }

    public String input_file_path() {
        Scanner input = new Scanner(System.in);
        System.out.print("Введите имя файла:");
        final String fileName = input.nextLine();
        System.out.print("Введите путь до папки, где хотите разместить файл(с обратным слешем):");
        final String filePath = input.nextLine() + fileName;
        return filePath;
    }

    @Override
    public void execute(String args[]) {
        final String filePathAndName = input_file_path();
        /*try {
           /* File file = new File(filePathAndName);
            file.createNewFile();
            FileWriter writer = new FileWriter(file);
            writer.write(collectionManager.save_xml());
            writer.flush();
            writer.close();
        }
        catch (IOException e) {
            System.out.println(filePathAndName);
            System.out.println("Не удалось создать файл. Проверьте путь и имя файла");
        }*/
    }

    @Override
    public String toString() {
        return "save - сохраняет коллекцию в файл";
    }
}
