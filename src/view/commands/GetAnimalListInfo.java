package view.commands;

import view.ConsoleUI;

public class GetAnimalListInfo extends Command{

    public GetAnimalListInfo(ConsoleUI consoleUI) {
        super("Get animal list", consoleUI);
    }

    public void execute(){
        getConsoleUI().GetAnimalListInfo();
    }
}