package view;

import presenter.Presenter;

import java.util.Scanner;

public class ConsoleUI implements View {
    private Presenter presenter;
    private Scanner scanner;
    private boolean work;
    private MainMenu menu;

    public ConsoleUI() {
        presenter = new Presenter(this);
        scanner = new Scanner(System.in);
        work = true;
        menu = new MainMenu(this);
    }

    @Override
    public void start() {
        System.out.println("Hello there");
        while (work) {
            System.out.println(menu.menu());
            System.out.println("Select action:");
            String choice = scanner.nextLine();
            int choiceInt = Integer.parseInt(choice);
            menu.execute(choiceInt);
        }
    }

    public void finish() {
        System.out.println("See you again !");
        work = false;
    }

    public void errorInput() {
        System.out.println("Invalid value");
    }


    public void GetAnimalListInfo() {
        presenter.GetAnimalListInfo();
    }

    public void addNew(){
        System.out.println("Provide animal name:");
        String name = scanner.nextLine();
        System.out.println("Is it a domestic pet or a pack animal ? ");
        String animalClass = scanner.nextLine();
        System.out.println("What commands does the animal know ? ");
        String commands = scanner.nextLine();

        presenter.addNew(name, animalClass, commands);
    }

    @Override
    public void printAnswer(String text) {
        System.out.println(text);
    }
}