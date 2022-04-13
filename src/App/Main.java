package App;

import Parser.ParserFromXml;

public class Main {

    public static void main(String args[]) {
        /*Scanner input = new Scanner(System.in);
        CommandsList commandsList = new CommandsList();

        while (true) {
            System.out.println("Введите команду");
            String command = input.nextLine();
            commandsList.execute(command, false);
        }*/
        ParserFromXml pars = new ParserFromXml();
        pars.parser();
    }
}
