package Commands;

import App.CommandsList;
import InputInfo.FileInputInformation;

import java.io.IOException;
import java.nio.file.Path;
import java.util.Scanner;

public class ExecuteScript implements Command{
    private final CommandsList commandsList;
    private final FileInputInformation fileInputInformation = new FileInputInformation();

    public ExecuteScript(CommandsList commandsList) {
        this.commandsList = commandsList;
    }


    @Override
    public void execute(String args[], boolean fromFile) {
        try {
            Path path = fileInputInformation.input();
            Scanner inputFromFile = new Scanner(path);
            while (inputFromFile.hasNext()){
                String command = inputFromFile.nextLine();
                commandsList.execute(command, true);
            }
        }
        catch (IOException e) {
            System.out.println("Похоже кто - то безвольный раб и прав даже на файл не имеет");
        }
    }

    @Override
    public String toString() {
        return "execute_script - выполняет ваш скрипт";
    }
}
