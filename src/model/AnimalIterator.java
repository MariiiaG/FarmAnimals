package model;

import java.util.Iterator;
import java.util.List;

public class AnimalIterator<T> implements Iterator<T> {
    private int index;
    private List<T> animalList;
    public AnimalIterator(List<T> animalList) {
        this.animalList = animalList;
    }
    @Override
    public boolean hasNext() {
        return animalList.size() > index;
    }
    @Override
    public T next() {
        return animalList.get(index++);
    }
}
