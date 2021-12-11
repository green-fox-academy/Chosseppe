package C03_Aircraft_carrier;

import java.util.ArrayList;
import java.util.List;

public class Carrier {

    List<Aircrafts> carrier;
    static int MainAmmoStorage;
    int Health;
    int TakenDMG;
    int DealedDMG;

    public Carrier(int InitAmmo, int InitHP){
        carrier = new ArrayList<>();
        this.MainAmmoStorage = InitAmmo;
        this.Health = InitHP;
        this.DealedDMG = 0;

    }

    public static int getMainAmmoStorage(){
        return MainAmmoStorage;
    }

    public static int setMainAmmoStorage(int ammo){
        return MainAmmoStorage = ammo;
    }

    public void add(Aircrafts aircraft){
        carrier.add(aircraft);
    }


}
