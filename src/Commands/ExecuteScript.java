package Commands;

import App.CollectionManager;
import App.CommandsList;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class ExecuteScript implements Command{

    @Override
    public void execute(String args[]) {
        try {
            Scanner input = new Scanner("D:\1.txt");
            while (input.hasNext()){
                String commandCut[] = input.nextLine().trim().split("\s+");
                String commandName = commandCut[0];
                String arg[] = Arrays.copyOfRange(commandCut, 1, commandCut.length);

               /* if (CommandsList.commands.containsKey(commandName)) {
                    CommandsList.commands.get(commandName).execute(arg);
                } else {
                    System.out.println("Проверьте файл!");
                }*/
            }
        }
        catch (Exception e){
            System.out.println("ups");
        }


    }
}
