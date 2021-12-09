package C11_Petrol_Station;
// cappacity for car is set to 50 litres
public class Car {
    String car = new String();
    int cappacity = 100;
    int gasAmmount = 0;

    public void gasAmmount(){
        System.out.println("The car has " + (this.gasAmmount * 0.5) + " litres of gasoline.");
    }
}