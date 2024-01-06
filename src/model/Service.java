package model;

public class Service {
    private AnimalFarm<Animal> group;
    private int id;

    public Service() {
        group = new AnimalFarm<>();
    }

    public void addNew(String name, String animalClass, String commands) {
        Animal animal = new Animal(id++, name, animalClass, commands);
        group.addNew(animal);
    }

    public String getAnimalInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Group name list:\n");

        for (Animal animal: group) {
            stringBuilder.append(animal);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

}
