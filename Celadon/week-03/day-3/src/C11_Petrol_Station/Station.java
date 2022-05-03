package C11_Petrol_Station;
// Gas station is set to have 5000l tank for gasoline
public class Station {
    String station = new String();
    int gasAmmount = 100;
    private int carFilled = 0;

    public void refill(Car car){
        this.carFilled++ ;
        car.gasAmmount = 100;
        this.gasAmmount--;
    }

    public void gasAmmount(){
        System.out.println("Station has " + (this.gasAmmount * 50) + " litres of gasoline");
    }

}
