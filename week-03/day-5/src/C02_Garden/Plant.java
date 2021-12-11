package C02_Garden;

public class Plant {

    String type;
    String color;
    double WaterAmount;
    int needWater;

    public void status() {
        if (this.WaterAmount < this.needWater) {
            System.out.println("The " + this.color + " " + this.type + " needs water");
        } else {
            System.out.println("The " + this.color + " " + this.type + " does not need water");

        }
    }

    public void getWaterAmount(){
        System.out.println(this.WaterAmount);

    }


}
