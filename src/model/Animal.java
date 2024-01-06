package model;

public class Animal implements FarmItem{
    private int id;
    private String name;
    private String animalClass;
    private String commands;

    public Animal(int id, String name, String animalClass, String commands) {
        this.id = id;
        this.name = name;
        this.animalClass = animalClass;
        this.commands = commands;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", class='" + animalClass + '\'' +
                ", commands=" + commands +
                '}';
    }

    @Override

    public String getCommands() {
        return commands;
    }
    public String getAnimalClass() {
        return animalClass;
    }
    public String getName() {
        return name;
    }
}

