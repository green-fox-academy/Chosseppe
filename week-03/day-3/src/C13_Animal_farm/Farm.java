package C13_Animal_farm;

import java.util.ArrayList;
import java.util.List;

public class Farm {
    List<Animal> listofanimals;
    int limit;
    public void listOfAnimals(int limit){
        listofanimals = new ArrayList<>(limit);
        this.limit = limit;
    }

    public void sell(){
        Animal lesshungry = this.listofanimals.get(0);
        for(Animal animal: this.listofanimals){
            if(lesshungry.getHunger() > animal.getHunger()){
                lesshungry = animal;
            }
        }
        listofanimals.remove(lesshungry);
    }

    public void breed(){
        if(this.listofanimals.size() < this.limit){
            Animal animal = new Animal();
            listofanimals.add(animal);
        }


    }

}
