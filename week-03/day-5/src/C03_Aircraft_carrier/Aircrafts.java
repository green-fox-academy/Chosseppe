package C03_Aircraft_carrier;

import java.util.List;

public class Aircrafts {

    String type;
    int MaxAmmo;
    int BaseDamage;
    int AmmoStorage;
    int Damage;

    public void getStatus(){
        System.out.println("Type " + this.type + ", Ammo: " + this.AmmoStorage + ", Base Damage: " + this.BaseDamage + ", All Damage: " + this.Damage);
    }

    public void getType(){
        System.out.println("Type " + this.type);
    }

    public boolean isPriority(){
        return (this.type == "F35");
    }

    public int RefillAmmo(int input_ammo) {
        int unused_Ammo = this.AmmoStorage;
        this.AmmoStorage += input_ammo;
        return unused_Ammo;
    }

    public void fight(){
        for(int d = AmmoStorage -1; d >= 0; d--){
            this.AmmoStorage --;
            this.Damage +=  this.BaseDamage;
            //carrier.TakenDMG += Damage;
        }
    }
}

