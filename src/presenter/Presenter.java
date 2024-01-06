package presenter;

import model.Service;
import view.View;

public class Presenter {
    private View view;
    private Service service;

    public Presenter(View view) {
        this.view = view;
        service = new Service();
    }

    public void addNew(String name, String animalClass, String commands) {
        service.addNew(name, animalClass, commands);
        GetAnimalListInfo();
    }

    public void GetAnimalListInfo() {
        String info = service.getAnimalInfo();
        view.printAnswer(info);
    }
}

