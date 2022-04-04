package App;

import App.CollectionManager;
import Commands.*;

import java.util.Arrays;
import java.util.HashMap;


public class CommandsList {
    public static final HashMap<String, Command> commands = new HashMap<>();
    private final CollectionManager collectionManager = new CollectionManager();

    public CommandsList() {
        commands.put("add", new Add(collectionManager));
        commands.put("info", new Info(collectionManager));
        commands.put("show", new Show(collectionManager));
        commands.put("update", new Update(collectionManager));
        commands.put("remove_by_id", new RemoveById(collectionManager));
        commands.put("clear", new Clear(collectionManager));
        commands.put("remove_first", new RemoveFirst(collectionManager));
        commands.put("print_ascending", new PrintAscending(collectionManager));
        commands.put("filter_starts_with_soundtrack_name", new FilterStartsWithSoundtrackName(collectionManager));
        commands.put("count_less_than_weapon_type", new CountLessThanWeaponType(collectionManager));
        commands.put("remove_greater", new RemoveGreater(collectionManager));
        commands.put("add_if_min", new AddIfMin(collectionManager));
        commands.put("save", new Save(collectionManager));
        commands.put("help", new Help());
        commands.put("exit", new Exit());
    }

    public void execute(String command) {

        String commandCut[] = command.trim().split(" ");
        String commandName = commandCut[0];
        String args[] = Arrays.copyOfRange(commandCut, 1, commandCut.length);

        if (commands.containsKey(commandName)) {
            commands.get(commandName).execute(args);
        } else {
            System.out.println("Введите команду заново!");
        }
    }
}
