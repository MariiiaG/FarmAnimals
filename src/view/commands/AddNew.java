package view.commands;

import view.ConsoleUI;

public class AddNew extends Command{

    public AddNew(ConsoleUI consoleUI) {
        super("Add a new animal", consoleUI);
    }

    public void execute(){
        getConsoleUI().addNew();
    }
}

