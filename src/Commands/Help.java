package Commands;

import App.*;

public class Help implements Command {

    @Override
    public void execute(String args[]) {
        for (Command value: CommandsList.commands.values()) {
            System.out.println(value.toString());
        }
    }

    @Override
    public String toString() {
        return "Commands.Help - выводит справку по доступным командам";
    }
}
