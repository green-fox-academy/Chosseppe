package C03_Aircraft_carrier;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Aircrafts Aircraft0_0 = new F35();
        Aircrafts Aircraft0_1 = new F16();
        Aircrafts Aircraft0_2 = new F35();
        Aircrafts Aircraft0_3 = new F16();
        Aircrafts Aircraft0_4 = new F35();
        Aircrafts Aircraft0_5 = new F16();

        Aircrafts Aircraft1_0 = new F16();
        Aircrafts Aircraft1_1 = new F16();
        Aircrafts Aircraft1_2 = new F16();
        Aircrafts Aircraft1_3 = new F16();
        Aircrafts Aircraft1_4 = new F35();

        Aircrafts Aircraft2_0 = new F35();
        Aircrafts Aircraft2_1 = new F35();
        Aircrafts Aircraft2_2 = new F35();
        Aircrafts Aircraft2_3 = new F35();
        Aircrafts Aircraft2_4 = new F35();
        Aircrafts Aircraft2_5 = new F35();
        Aircrafts Aircraft2_6 = new F35();
        Aircrafts Aircraft2_7 = new F35();
        Aircrafts Aircraft2_8 = new F35();
        Aircrafts Aircraft2_9 = new F35();
        Aircrafts Aircraft2_10 = new F16();
        Aircrafts Aircraft2_11 = new F16();

        Carrier carrier0 = new Carrier("Peter", 35, 6000);
        Carrier carrier1 = new Carrier("Eugen", 43, 4500);
        Carrier carrier2 = new Carrier("Marco", 500, 10000);


        carrier0.add(Aircraft0_0);
        carrier0.add(Aircraft0_1);
        carrier0.add(Aircraft0_2);
        carrier0.add(Aircraft0_3);
        carrier0.add(Aircraft0_4);
        carrier0.add(Aircraft0_5);

        carrier1.add(Aircraft1_0);
        carrier1.add(Aircraft1_1);
        carrier1.add(Aircraft1_2);
        carrier1.add(Aircraft1_3);
        carrier1.add(Aircraft1_4);

        carrier2.add(Aircraft2_0);
        carrier2.add(Aircraft2_1);
        carrier2.add(Aircraft2_2);
        carrier2.add(Aircraft2_3);
        carrier2.add(Aircraft2_4);
        carrier2.add(Aircraft2_5);
        carrier2.add(Aircraft2_6);
        carrier2.add(Aircraft2_7);
        carrier2.add(Aircraft2_8);
        carrier2.add(Aircraft2_9);
        carrier2.add(Aircraft2_10);
        carrier2.add(Aircraft2_11);

        carrier0.getStatus();
        System.out.println("");
        carrier0.fill();
        carrier0.getStatus();
        System.out.println("");

        carrier1.getStatus();
        System.out.println("");
        carrier1.fill();
        carrier1.getStatus();
        System.out.println("");

        carrier2.getStatus();
        System.out.println("");
        carrier2.fill();
        carrier2.getStatus();
        System.out.println("");


        carrier0.fight(carrier1);
        carrier0.getStatus();
        carrier1.getStatus();

        carrier2.fight(carrier0);
        carrier0.getStatus();
        carrier2.getStatus();
    }
}
