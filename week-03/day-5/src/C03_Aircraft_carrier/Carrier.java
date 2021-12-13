package C03_Aircraft_carrier;

import java.util.ArrayList;
import java.util.List;

public class Carrier {

    List<Aircrafts> carrier;
    static String name;
    int MainAmmoStorage;
    int Health;
    int TakenDMG;
    int DealedDMG;

    public Carrier(String name, int InitAmmo, int InitHP){
        this.name = name;
        carrier = new ArrayList<>();
        this.MainAmmoStorage = InitAmmo;
        this.Health = InitHP;
        this.DealedDMG = 0;

    }


    public void add(Aircrafts aircraft){
        this.carrier.add(aircraft);
    }

    public void fill() {
        int count = 0;
        int sum_of_needed_ammo = 0;
        int priority_aircraft_ammo = 0;
        for (Aircrafts aircraft : this.carrier) {
            sum_of_needed_ammo += (aircraft.MaxAmmo - aircraft.AmmoStorage);
            if (aircraft.isPriority() == true) {
                priority_aircraft_ammo = aircraft.MaxAmmo;
                count++;
            }
        }
        int Priority_ammo = priority_aircraft_ammo * count;
        int Secondary_ammo = sum_of_needed_ammo - Priority_ammo;
        try {
            for (Aircrafts aircraft : this.carrier) {
                if (MainAmmoStorage >= sum_of_needed_ammo) {
                    while (aircraft.AmmoStorage < aircraft.MaxAmmo && MainAmmoStorage > 0) {
                        --MainAmmoStorage;
                        --sum_of_needed_ammo;
                        aircraft.RefillAmmo(1);
                    }
                } else if (MainAmmoStorage > 0 && Priority_ammo > 0 && aircraft.isPriority() == true) {
                    while (aircraft.AmmoStorage < aircraft.MaxAmmo && MainAmmoStorage > 0 && Priority_ammo > 0) {
                        --MainAmmoStorage;
                        --Priority_ammo;
                        aircraft.RefillAmmo(1);
                    }
                    if (MainAmmoStorage <= 0) {
                        throw new IllegalArgumentException();
                    }
                }
            }
            for (Aircrafts aircraft2 : this.carrier) {
                if (MainAmmoStorage > 0 && Secondary_ammo > 0 && aircraft2.isPriority() == false) {
                    while (Secondary_ammo > 0 && aircraft2.AmmoStorage < aircraft2.MaxAmmo && MainAmmoStorage > 0) {
                        --MainAmmoStorage;
                        --Secondary_ammo;
                        aircraft2.RefillAmmo(1);
                    }
                    if (MainAmmoStorage <= 0) {
                        throw new IllegalArgumentException();
                    }
                }
            }

        } catch (IllegalArgumentException e) {
            System.out.println("There is no Ammo!");
        }
    }

    public void fight(Carrier Input_carrier){
        for(Aircrafts aircraft: this.carrier) {
            aircraft.fight();
            try{
                if(Input_carrier.Health- Input_carrier.DealedDMG > 0) {
                    this.DealedDMG += aircraft.Damage;
                    Input_carrier.TakenDMG += aircraft.Damage;
                    if ((Input_carrier.Health - Input_carrier.TakenDMG) <= 0) {
                        throw new IllegalArgumentException();
                        }
                    }
            }catch (IllegalArgumentException e) {
                System.out.println("Your enemy has fallen!");
            }
        }
    }

    public void getStatus(){
        if((this.Health - this.TakenDMG) == 0){
            System.out.println("You are DEAD, " + Carrier.name);
        }else {
            System.out.println("HP: " + (this.Health - this.TakenDMG) + ", Aircraft count: " + this.carrier.size() +
                    ", Ammo Storage: " + this.MainAmmoStorage + ", Total damage: " + this.DealedDMG + "\n Aircrafts:");
            for (Aircrafts aircraft : carrier) {
                aircraft.getStatus();
            }
        }
    }
}
