package C02_Garden;

public class Tree extends Plant{

    public Tree(String color) {
        super.type = "Tree";
        super.color = color;
        super.WaterAmount = 0;
        super.needWater = 10;
    }

}
