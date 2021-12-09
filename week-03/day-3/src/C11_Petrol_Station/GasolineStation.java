package C11_Petrol_Station;

public class GasolineStation {

    public static void main(String[] args) {

        Station OMV = new Station();

        Car car1 = new Car();
        car1.gasAmmount();

        System.out.println("");

        Car car2 = new Car();
        car2.gasAmmount();
        OMV.refill(car2);
        car2.gasAmmount();
        OMV.gasAmmount();

        System.out.println("");

        Car car3 = new Car();
        car3.gasAmmount();

        System.out.println("");

        Car car4 = new Car();
        car4.gasAmmount();
        OMV.refill(car4);
        car4.gasAmmount();

        Car car5 = new Car();
        car5.gasAmmount();

        Car car6 = new Car();
        car6.gasAmmount();
        OMV.refill(car6);
        car6.gasAmmount();
        OMV.gasAmmount();

        System.out.println("");

        Car car7 = new Car();
        car7.gasAmmount();

        System.out.println("");

        Car car8 = new Car();
        car8.gasAmmount();
        OMV.refill(car8);
        car8.gasAmmount();

        System.out.println("");

        Car car9 = new Car();
        car9.gasAmmount();

        System.out.println("");

        Car car10 = new Car();
        car10.gasAmmount();
        OMV.refill(car10);
        car10.gasAmmount();
        OMV.gasAmmount();

    }
}
