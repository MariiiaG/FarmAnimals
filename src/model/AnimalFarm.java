package model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AnimalFarm<E extends FarmItem> implements Iterable<E>{
    private List<E> animalList;

    public AnimalFarm() {
        animalList = new ArrayList<>();
    }

    public  void addNew(E animal) {
        animalList.add(animal);
    }

    @Override
    public Iterator<E> iterator() {
        return new AnimalIterator<>(animalList);
    }


}

