package C02_Garden;

import java.util.ArrayList;
import java.util.List;

public class Garden {

    static String gname;
    static List<Plant> plants;

    public static void CreateGarden(String name){
        gname = name;
        plants = new ArrayList<>();

        Flower flower1 = new Flower("Yellow");
        Tree tree1 = new Tree("Purple");
        Flower flower2 = new Flower("Blue");
        Tree tree2 = new Tree("Orange");

        plants.add(flower1);
        plants.add(tree1);
        plants.add(flower2);
        plants.add(tree2);

    }

    public static void WaterStatus(){
        for(Plant plant : plants){
            plant.status();
        }
    }

    public static void Water40() {
        System.out.println("Watering with 40");
        int temp = 0;
        for(Plant plant :plants){
            if(plant.WaterAmount <= plant.needWater) {
                temp++;
            }

        }
        for (Plant plant : plants) {
            if (plant.type == "Flower" && plant.WaterAmount <= plant.needWater) {
                plant.WaterAmount = (40 / temp) * 0.75;
            } else if (plant.type == "Tree" && plant.WaterAmount <= plant.needWater){
                    plant.WaterAmount = (40 / temp) * 0.4;


            }
        }
    }

    public static void status(){
        for(Plant plant : plants){
            System.out.println(plant.color + " " + plant.type + " " + plant.WaterAmount);
        }
    }

    public static void Water70() {
        System.out.println("Watering with 70");
        int temp = 0;
        for(Plant plant :plants){
            if(plant.WaterAmount <= plant.needWater) {
                temp++;
            }

        }
        for (Plant plant : plants) {
            if (plant.type == "Flower" && plant.WaterAmount <= plant.needWater) {
                plant.WaterAmount = (70 / temp) * 0.75;
            } else if (plant.type == "Tree" && plant.WaterAmount <= plant.needWater){
                plant.WaterAmount = (70 / temp) * 0.4;


            }
        }
    }
}
